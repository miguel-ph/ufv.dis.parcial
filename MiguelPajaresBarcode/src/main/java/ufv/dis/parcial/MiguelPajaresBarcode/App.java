package ufv.dis.parcial.MiguelPajaresBarcode;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.ArrayList;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.oned.EAN13Writer;


public class App 
{
    public static void main( String[] args ) throws WriterException, IOException
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
        
        Path path = FileSystems.getDefault().getPath("./BARCODE.png");
        EAN13Writer barcode = new EAN13Writer();
        BitMatrix bitMatrix = barcode.encode("978020537962", BarcodeFormat.EAN_13, 500, 200);
        MatrixToImageWriter.writeToPath(bitMatrix, "png", path);

    }
}
