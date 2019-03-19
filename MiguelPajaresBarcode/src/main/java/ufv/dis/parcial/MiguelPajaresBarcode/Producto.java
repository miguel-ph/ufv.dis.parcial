package ufv.dis.parcial.MiguelPajaresBarcode;


public class Producto {

	private String nombre;
	private String marca;
	private String EAN13;
	
	public Producto(String nombre, String marca, String EAN13) {
		super();
		this.nombre = nombre;
		this.marca = marca;
		this.EAN13 = EAN13;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getEAN13() {
		return EAN13;
	}

	public void setEAN13(String eAN13) {
		EAN13 = eAN13;
	}

	@Override
	public String toString() {
		return "Nombre: " + this.getNombre() +
				" Marca: " + this.getMarca() +
				" EAN13: " + this.getEAN13();
	}
	
}
