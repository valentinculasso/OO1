package ar.edu.info.unlp.ejercicioDemo;

public class Gerente extends Empleado{

	public Gerente(String nombre) {
		super(nombre);
	}
	
	public double aportes() {
		return this.montoBasico() * 0.005d;
	}
	
	public double montoBasico() {
		return 57000;
	}
	
	
	
}
