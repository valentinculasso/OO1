package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Usuario {
	
	private String nombre;
	private String direccion;
	private int DNI;
	private List<Propiedad> propiedades;
	private List<Reserva> reservas;
	
	public Usuario(String nombre, String direccion, int dNI) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.DNI = dNI;
		this.propiedades = new ArrayList<Propiedad>();
		this.reservas = new ArrayList<Reserva>();
	}
	
	public void agregarPropiedad(Propiedad propiedad) {
		this.propiedades.add(propiedad);
	}
	
	public void agregarReserva(Reserva reserva) {
		this.reservas.add(reserva);
	}
	
	public void eliminarPropiedad(Propiedad propiedad) {
		this.propiedades.remove(propiedad);
	}
	
	public void eliminarReserva(Reserva reserva) {
		this.reservas.remove(reserva);
	}
	
	public List<Propiedad> propiedadesDisponibles(DateLapse periodo){
		return this.propiedades.stream().filter(propiedad -> propiedad.estaDisponible(periodo)).collect(Collectors.toList());
	}
	
	public List<Reserva> obtenerReservas(){
		return this.reservas;
	}
	
}
