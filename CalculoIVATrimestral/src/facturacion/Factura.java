package facturacion;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Factura {
	private int numero;
    private List<Producto> productos;
    private Calendar fecha;

    public Factura(int numero, List<Producto> productos, Calendar fecha) {
		this.numero = numero;
		this.productos = productos;
		this.fecha = fecha;
	}
    
    public Factura(int numero, List<Producto> productos) {
		this.numero = numero;
		this.productos = productos;
	}
     
	public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public List<Producto> getProductos() {
        return productos;
    }
    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
	
    public Calendar getFecha() {
		return fecha;
	}
	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}

	public String toString() {
		int dia = fecha.get(Calendar.DAY_OF_MONTH);
		int mes = fecha.get(Calendar.MONTH);
		int ano = fecha.get(Calendar.YEAR);
		
		System.out.println("Factura " + numero + ":");
		System.out.println("Fecha: " + dia + "/" + (mes) + "/" + ano);
		for (Producto producto:productos) {
			System.out.println("  " + producto.getDescripcion() + ": " + producto.getImporte());
		}
		return "";
	}
}
