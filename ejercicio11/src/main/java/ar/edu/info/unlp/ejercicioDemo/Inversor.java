package ar.edu.info.unlp.ejercicioDemo;

import java.util.List;
import java.util.ArrayList;

public class Inversor{
	
	private String nombre;
	List <Inversiones> inversiones;
	
	public Inversor(String unNombre) {
		this.nombre = unNombre;
		this.inversiones = new ArrayList<Inversiones>();
	}
	
	public void agregarInversion(Inversiones inversion) {
		this.inversiones.add(inversion);
	}
	
	public double valorActual() {
		return this.inversiones.stream().mapToDouble(Inversiones -> Inversiones.valorActual()).sum();
	}
	
	
}
