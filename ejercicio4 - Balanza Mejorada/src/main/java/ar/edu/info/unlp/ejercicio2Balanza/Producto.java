package ar.edu.info.unlp.ejercicio2Balanza;

public class Producto extends Object{
	
	private double peso;
	private double precioPorKilo;
	private String descripcion;
	
	public Producto() {
		this.peso= 0;
		this.precioPorKilo= 0;
		this.descripcion= "";
	}
	
	//GETTERS Y SETTERS
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getPrecioPorKilo() {
		return precioPorKilo;
	}

	public void setPrecioPorKilo(double precioPorKilo) {
		this.precioPorKilo = precioPorKilo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	//METODOS
	public double getPrecio() {
		double total=0;
		total= this.peso*this.precioPorKilo;
		return total;
	}
	
}
