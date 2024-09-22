package ar.edu.info.unlp.ejercicioDemo;

public class Circulo implements Figura{

	private double radio;
	
	
	// Metodos a implementar en el UML.
	
	public double getDiametro() {
		return this.radio*2;
	}
	
	// Recibo el diametro, por lo cual setDiametro me modifica en realidad el radio, entonces si tengo diametro 3 (radio 1.5) y quiero diametro 6 (radio 3), modifico el radio por consecuente se modifica mi diametro
	public void setDiametro(double diametro) {
		this.radio = diametro/2;
	}
	
	public double getRadio() {
		return this.radio;
	}
	
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	// Metodos de interface
	
	public double getPerimetro() {
		return Math.PI * getDiametro();
	}
	
	public double getArea() {
		return Math.PI * (radio * radio);
	}
	
}
