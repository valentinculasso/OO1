package ar.edu.info.unlp.ejercicioDemo;

public class Cuadrado implements Figura{
	
	private double lado; // Osea no necesariamente tiene que ser un entero
	
	// Metodos a implementar en el UML.
	
	public void setLado(double valor) {
		this.lado = valor;
	}
	
	public double getLado() {
		return this.lado;
	}
	
	// Metodos de interface
	
	public double getPerimetro() {
		return this.lado*4;
	}
	
	public double getArea() {
		return Math.pow(this.lado, 2);
	}
	
	
	
	
}
