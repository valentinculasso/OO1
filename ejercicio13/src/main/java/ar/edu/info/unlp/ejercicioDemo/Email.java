package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.List;

public class Email {
	
	private String titulo;
	private String cuerpo;
	List<Archivo> adjuntos;
	
	public Email(String titulo, String cuerpo) {
		this.titulo = titulo;
		this.cuerpo = cuerpo;
		this.adjuntos = new ArrayList<Archivo>();
	}
	
	public Email(String titulo, String cuerpo, List<Archivo> adjuntos) {
		this.titulo = titulo;
		this.cuerpo = cuerpo;
		this.adjuntos = new ArrayList<Archivo>(adjuntos);
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public String getCuerpo() {
		return this.cuerpo;
	}
	
	public List<Archivo> adjuntos(){
		return new ArrayList<Archivo>(this.adjuntos);
	}
	
	// Me retorna verdadero si el texto se encuentra en el titulo o cuerpo
	public boolean contiene(String texto) {
		return (this.titulo.contains(texto) || this.cuerpo.contains(texto));
	}
	
	// Me retorna la longitud del titulo + la longitud del cuerpo + la longitud de los archivos
	public double getEspacioOcupado() {
		return this.titulo.length() + this.cuerpo.length() + this.getLongitudArchivos();
	}
	
	// Me retorna el tamaño (la longitud) de los archivos, osea la suma del tamaño de TODOS los archivos
	private double getLongitudArchivos() {
		return this.adjuntos.stream().mapToDouble(archivo -> archivo.tamaño()).sum();
	}
}
