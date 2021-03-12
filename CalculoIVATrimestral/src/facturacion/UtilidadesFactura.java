package facturacion;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UtilidadesFactura {
	private Factura f;

		public UtilidadesFactura(Factura f) {
			super();
			this.f = f;
		}

		public Factura getF() {
			return f;
		}

		public void setF(Factura f) {
			this.f = f;
		}

		public static double calcularImporteFactura(Factura f) {
			List<Producto> lista = new ArrayList<Producto>();
			double total = 0;
			
			lista = f.getProductos();
			
			for(Producto producto:lista) {
				total += producto.getImporte();
			}
			return total;
		}
		
		public static double calcularIVAFactura(Factura f) {
			List<Producto> lista = new ArrayList<Producto>();
			double total = 0;
			
			lista = f.getProductos();
			
			for(Producto producto:lista) {
				double IVA = producto.getTipoIVA().getPorcentaje();
				double precio = producto.getImporte();
				
				total += (precio*IVA/100);
			}		
			return total;
		}

		public static double calcularImporteFacturaConIVA(Factura f) {
			double total;
			
			total = calcularImporteFactura(f) + calcularIVAFactura(f);
			
			return total;
		}
}
