package ar.edu.info.unlp.ejercicioDemo;

import java.util.List;
import java.util.ArrayList;

public class ReporteDeConstruccion {
	
	List<Pieza> piezas;

	public ReporteDeConstruccion() {
		this.piezas = new ArrayList<Pieza>();
	}
	
	public void agregarPieza(Pieza pieza) {
		this.piezas.add(pieza);
	}
	
	public double volumenDeMaterial(String material) {
		return this.piezas.stream().filter(Pieza -> Pieza.getMaterial().equals(material)).mapToDouble(Pieza::volumen).sum();
	}
	
	public double superficieDeColor(String color) {
		return this.piezas.stream().filter(Pieza -> Pieza.getColor().equals(color)).mapToDouble(Pieza::superficie).sum();
	}
	
}
