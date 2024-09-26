package ar.edu.info.unlp.ejercicioDemo;

import java.util.List;
import java.util.ArrayList;

public class Farola {

	private boolean encendida;
	private List<Farola> vecinas;
	
	
//Crear una farola. Debe inicializarla como apagada 
	
	public Farola() {
		this.encendida = false;
		this.vecinas = new ArrayList<Farola>();
	}
	
	
	private void agregarFarola(Farola otraFarola) {
		if(this.vecinas.contains(otraFarola)) {
			return;
		}
		this.vecinas.add(otraFarola);
	}
	
	 /*
	 * Crea la relación de vecinos entre las farolas. La relación de vecinos
	 entre las farolas es recíproca, es decir el receptor del mensaje será vecino
	 de otraFarola, al igual que otraFarola también se convertirá en vecina del
	 receptor del mensaje
	 */
	
	public void pairWithNeighbor( Farola otraFarola ) {
		this.agregarFarola(otraFarola);
		otraFarola.agregarFarola(this);
	}
	
//  Retorna sus farolas vecinas
	
	public List<Farola> getNeighbors (){
		//Envio una copia para que no este el riesgo de modificar mi lista original.
		return new ArrayList<Farola>(this.vecinas);
	}
	
// Si la farola no está encendida, la enciende y propaga la acción.
	
	 public void turnOn() {
		 if (!this.encendida) {
			 this.encendida = true;
			 this.vecinas.forEach(farola -> farola.turnOn());
		 }
	 }
	 
	 
// Si la farola no está apagada, la apaga y propaga la acción.
	 
	 public void turnOff() {
		 if (this.encendida) {
			 this.encendida = false;
			 this.vecinas.forEach(farola -> farola.turnOff());
		 }
	 }
	 
// Retorna true si la farola está encendida.
	 
	 public boolean isOn() {
		 return this.encendida;
	 }
	 
	 public boolean isOff() {
		 return !this.encendida;
	 }
	 
}