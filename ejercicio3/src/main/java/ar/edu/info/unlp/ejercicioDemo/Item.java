package ar.edu.info.unlp.ejercicioDemo;

public class Item{
	
	private String detalle;
	private int cantidad;
	private double costoUnitario;
	
	public Item(String detalle, int cantidad, double costoUnitario) {
		this.detalle = detalle;
		this.cantidad = cantidad;
		this.costoUnitario = costoUnitario;
	}
	
	// Getters y setters
	
	public double getCostoUnitario() {
		return costoUnitario;
	}
	
	public String getDetalle() {
		// este get lo pongo para que detalle no me marque que no es usado.
		return detalle;
	}
	
	// Fin getters y setters
	
	public double costo() {
		return cantidad*costoUnitario;
	}

	
	
	
}
