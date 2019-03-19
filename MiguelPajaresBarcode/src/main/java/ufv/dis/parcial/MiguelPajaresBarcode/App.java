package ufv.dis.parcial.MiguelPajaresBarcode;

import java.util.ArrayList;


public class App 
{
    public static void main( String[] args )
    {
    	ArrayList<Producto> productos = new ArrayList<Producto>();
    	
    	String EAN13 = "978020537962";
    	
    	Producto producto1 = new Producto("Leche", "Asturiana", EAN13);
    	Producto producto2 = new Producto("Cacao", "ColaCao", EAN13);
    	Producto producto3 = new Producto("Refresco", "Fanta", EAN13);
    	Producto producto4 = new Producto("Pizza", "Tarradellas", EAN13);
    	
    	productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
        productos.add(producto4);
        
        for(Producto a : productos) {
     	   
            System.out.println(a);

        }

    }
}
