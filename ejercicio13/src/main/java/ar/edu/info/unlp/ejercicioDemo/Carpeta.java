package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.List;

public class Carpeta {

	private String nombre;
	List<Email> emails;
	
	public Carpeta(String nombre) {
		this.nombre = nombre;
		this.emails = new ArrayList<Email>();
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public List<Email> getEmails(){
		return new ArrayList<Email>(this.emails);
	}

	// mueve el email desde una carpeta de origen a una carpeta destino (asuma que el email está en la carpeta origen cuando se recibe este mensaje).
	public void mover(Email email, Carpeta destino) {
		this.emails.remove(email);
	    destino.agregarMail(email);
	}
	
	public void agregarMail(Email email) {
		this.emails.add(email);
	}
	
	public Email buscarMail(String titulo) {
		return this.emails.stream().filter(Emails -> Emails.contiene(titulo)).findFirst().orElse(null);
	}
	
	public double valorEmails() {
		return this.emails.stream().mapToDouble(email -> email.getEspacioOcupado()).sum();
	}
}
