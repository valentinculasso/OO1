package ar.edu.info.unlp.ejercicioDemo;

public class Cuerpo3D extends Object{
	
	private Figura cara;
	private double altura;
	
	// Metodos en el UML.
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	public void setCaraBasal(Figura caraNueva) {
		this.cara = caraNueva;
	}
	
	public double getVolumen() {
		return this.cara.getArea()*this.altura;
	}
	
	public double getSuperficieExterior() {
		return ( 2*this.cara.getArea() ) + (this.cara.getPerimetro() * this.altura);
	}
	
}
