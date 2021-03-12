package gestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Random;

import facturacion.*;

public class ejercicio3 {
	public static void main(String[] args) {
		Producto leche = new Producto(0.75, "leche", IVA.SUPERREDUCIDO);
		Producto pan = new Producto(0.5, "pan", IVA.SUPERREDUCIDO);
		Producto salmon = new Producto(8.99, "salmon", IVA.NORMAL);
		Producto aguacates = new Producto(2.95, "aguacates", IVA.NORMAL);
		Producto friegasuelos = new Producto(2.95, "friegasuelos", IVA.REDUCIDO);
		Producto cerveza = new Producto(2.95, "cerveza", IVA.NORMAL);
		Producto sandia = new Producto(2.95, "sandia", IVA.REDUCIDO);

		List<Producto> productos = new ArrayList<Producto>();
		productos.add(leche);
		productos.add(pan);
		productos.add(salmon);
		productos.add(aguacates);
		productos.add(friegasuelos);
		productos.add(cerveza);
		productos.add(sandia);

		List<Factura> facturas = new ArrayList<Factura>();
		
		Random ale = new Random();
		for (int i = 1; i < 6; i++) {
			List<Producto> cesta = new ArrayList<Producto>();
			for (int numLista = 1; numLista < 11; numLista++) {
				int numProdAleatorio = ale.nextInt(7);
				cesta.add(productos.get(numProdAleatorio));
			}
			Factura comida = new Factura(i, cesta);
			facturas.add(comida);
		}

		Calendar fechaActual = new GregorianCalendar();
		Calendar fecha1 = new GregorianCalendar();
		fecha1.set(2020, 9, 02);
		Calendar fecha2 = new GregorianCalendar();
		fecha2.set(2020, 8, 10);
		Calendar fecha3 = new GregorianCalendar();
		fecha3.set(2020, 8, 23);
		Calendar fecha4 = new GregorianCalendar();
		fecha4.set(2020, 7, 19);

		facturas.get(0).setFecha(fechaActual);
		facturas.get(1).setFecha(fecha1);
		facturas.get(2).setFecha(fecha2);
		facturas.get(3).setFecha(fecha3);
		facturas.get(4).setFecha(fecha4);

		System.out.print(facturas.get(0).toString());
		System.out.printf("El IVA es de: %.2f € \n", UtilidadesFactura.calcularIVAFactura(facturas.get(0))+"\n");
		System.out.print(facturas.get(1).toString());
		System.out.printf("El IVA es de: %.2f € \n", UtilidadesFactura.calcularIVAFactura(facturas.get(1))+"\n");
		System.out.print(facturas.get(2).toString());
		System.out.printf("El IVA es de: %.2f € \n", UtilidadesFactura.calcularIVAFactura(facturas.get(2))+"\n");
		System.out.print(facturas.get(3).toString());
		System.out.printf("El IVA es de: %.2f € \n", UtilidadesFactura.calcularIVAFactura(facturas.get(3))+"\n");
		System.out.print(facturas.get(4).toString());
		System.out.printf("El IVA es de: %.2f € \n", UtilidadesFactura.calcularIVAFactura(facturas.get(4))+"\n");
		System.out.printf("El IVA total de todas las facturas de este trimestre es de:  %.2f € \n",
				UtilidadesCalculoIVA.calculoIVATrimestral(facturas));
		System.out.printf("El IVA de todas las facturas de este mes es de:  %.2f € \n",
				UtilidadesCalculoIVA.calculoIVAMesActual(facturas));
	}
}