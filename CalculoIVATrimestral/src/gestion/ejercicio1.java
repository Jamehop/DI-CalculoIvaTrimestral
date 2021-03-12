package gestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import facturacion.*;

public class ejercicio1
{
    public static void main(String[] args)
    {
    	Producto leche = new Producto(0.75, "leche");
		Producto pan = new Producto(0.5, "pan");
		Producto salmon = new Producto(8.99, "salmon");
		Producto aguacates = new Producto(2.95, "aguacates");
		Producto friegasuelos = new Producto(2.95, "friegasuelos");
		Producto cerveza = new Producto(2.95, "cerveza");
		Producto sandia = new Producto(2.95, "sandia");
		
		List<Producto> productos = new ArrayList<Producto>();
		productos.add(leche);
		productos.add(pan);
		productos.add(salmon);
		productos.add(aguacates);
		productos.add(friegasuelos);
		productos.add(cerveza);
		productos.add(sandia);
		
		Factura comida = new Factura(1, productos);
		System.out.println(comida);
    }
}
