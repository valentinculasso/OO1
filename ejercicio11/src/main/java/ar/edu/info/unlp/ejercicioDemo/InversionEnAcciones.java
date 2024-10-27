package ar.edu.info.unlp.ejercicioDemo;

public class InversionEnAcciones implements Inversiones{
	
	private String nombre;
	private int cantidad;
	private double valorUnitario;
	
	public InversionEnAcciones(String unNombre, int unaCantidad, double unValorUnitario) {
		this.nombre = unNombre;
		this.cantidad = unaCantidad;
		this.valorUnitario = unValorUnitario;
	}
	
	public double valorActual() {
		return this.cantidad*this.valorUnitario;
	}
	
	
}
