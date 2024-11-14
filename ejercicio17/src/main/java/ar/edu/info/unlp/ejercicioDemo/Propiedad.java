package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.List;

public class Propiedad {
	
	private String direccion;
	private String nombre;
	private double precio;
	private Usuario propietario;
	private List<Reserva> reservas = new ArrayList<Reserva>();
	
	
	public Propiedad(String direccion, String nombre, double precio, Usuario propietario) {
		this.direccion = direccion;
		this.nombre = nombre;
		this.precio = precio;
		this.propietario = propietario;
	}
	
	public double getPrecio() {
		return this.precio;
	}
	
	public boolean estaDisponible(DateLapse periodo) {
		return this.reservas.stream().noneMatch(reserva -> reserva.cumple(periodo));
	}
	
	public void agregarReserva(Reserva reserva) {
		this.reservas.add(reserva);
	}
	
	public void eliminarReserva(Reserva reserva) {
		this.reservas.remove(reserva);
	}
	
}
