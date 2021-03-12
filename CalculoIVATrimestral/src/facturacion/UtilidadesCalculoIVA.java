package facturacion;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class UtilidadesCalculoIVA {

	public static double calculoIVATrimestral(List<Factura> facturas) {
		double IVAtotal = 0;
		Calendar fechaActual = new GregorianCalendar();
		Calendar fechaLimite = new GregorianCalendar();
		fechaLimite.add(Calendar.MONTH, -3);
		for (Factura facComida : facturas) {
			Calendar fecha = new GregorianCalendar();
			fecha = facComida.getFecha();
			if (fecha.get(Calendar.MONTH) < fechaActual.get(Calendar.MONTH)
					&& fecha.get(Calendar.MONTH) >= (fechaLimite.get(Calendar.MONTH))) {
				IVAtotal += UtilidadesFactura.calcularIVAFactura(facComida);
			}
		}
		return IVAtotal;
	}

	public static double calculoIVAMesActual(List<Factura> facturas) {
		double IVAtotal = 0;
		Calendar fechaActual = new GregorianCalendar();
		for (Factura facComida : facturas) {
			Calendar fecha = new GregorianCalendar();
			fecha = facComida.getFecha();
			if (fecha.get(Calendar.MONTH) == fechaActual.get(Calendar.MONTH)) {
				IVAtotal += UtilidadesFactura.calcularIVAFactura(facComida);
			}
		}
		return IVAtotal;
	}
}
