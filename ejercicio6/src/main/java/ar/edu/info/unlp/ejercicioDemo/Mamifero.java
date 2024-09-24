package ar.edu.info.unlp.ejercicioDemo;
import java.time.LocalDate;

public class Mamifero {
	
	private String identificador;
	private String especie;
	private LocalDate fechaNacimiento;
	private Mamifero madre, padre;
	
	// Tambien el test instancia un mamifero nuevo vacio
	public Mamifero() {
		
	}
	
	// Para crear un nuevo mamifero le mando el identificador, en el constructor solo asigno a esa variable
	public Mamifero(String identificador) {
		this.identificador = identificador;
	}
	
	public String getIdentificador() {
		return this.identificador;
	}
	
	public void setIdentificador(String id) {
		this.identificador = id;
	}
	
	public String getEspecie() {
		return this.especie;
	}
	
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	public LocalDate getFechaNacimiento() {
		return this.fechaNacimiento;
	}
	
	public void setFechaNacimiento(LocalDate fecha) {
		this.fechaNacimiento = fecha;
	}
	
	public Mamifero getPadre() {
		return this.padre;
	}
	
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}
	
	public Mamifero getMadre() {
		return this.madre;
	}
	
	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	
	public Mamifero getAbueloMaterno() {
		if(this.madre.getPadre() != null) {
			return this.madre.getPadre();
		}
		return null;
	}
	
	public Mamifero getAbuelaMaterna() {
		if(this.madre.getMadre() != null) {
			return this.madre.getMadre();
		}
		return null;
	}
	
	public Mamifero getAbueloPaterno() {
		if(this.padre.getPadre() != null) {
			return this.padre.getPadre();
		}
		return null;
	}
	
	public Mamifero getAbuelaPaterna() {
		if(this.padre.getMadre() != null) {
			return this.padre.getMadre();
		}
		return null;
	}
	
	// este codigo esta bien, en el test no sale errores pero debo revisarlo
	public Boolean tieneComoAncestroA(Mamifero unMamifero) {
		boolean posee = false;
		if (this.padre == unMamifero || this.madre == unMamifero) {
			posee = true;
		}else {
			if (this.getMadre() != null) {
				posee = this.getMadre().tieneComoAncestroA(unMamifero);
			}
			if (!posee && (this.getPadre() != null)) {
				posee = this.getPadre().tieneComoAncestroA(unMamifero);
			}
		}
		return posee;
	}
	
	
	
	
	
	
}
