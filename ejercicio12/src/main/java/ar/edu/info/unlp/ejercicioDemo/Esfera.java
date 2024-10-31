package ar.edu.info.unlp.ejercicioDemo;


public class Esfera extends Pieza{
	
	private int radio;
	
	public Esfera(String material, String color, int radio) {
		super(material, color);
		this.radio = radio;
	}
	
	public double volumen() {
		return Math.pow(this.radio, 3)*Math.PI*(3.0/4.0);
	}
	
	public double superficie() {
		return Math.pow(this.radio, 2)*Math.PI*4;
	}
	
}
