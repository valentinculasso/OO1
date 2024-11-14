package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.util.*;

public class Sistema {
	
	private List<Usuario> usuarios = new ArrayList<Usuario>();
	
	
	public Usuario registrarUsuario(Usuario usuario) {
		usuarios.add(usuario);
		return usuario;
	}
	
	public Propiedad registrarPropiedad(Propiedad propiedad, Usuario usuario) {
		usuario.agregarPropiedad(propiedad);
		return propiedad;
	}
	
	public List<Propiedad> PropiedadesDisponibles(DateLapse periodo){
		List<Propiedad> disponibles = new ArrayList<>();
		for (Usuario usuario:this.usuarios) {
			disponibles.addAll(usuario.propiedadesDisponibles(periodo)); 
		} 
		return disponibles;
	}
	
	public Reserva hacerReserva(Propiedad propiedad, DateLapse periodo, Usuario inquilino) {
		if (propiedad.estaDisponible(periodo)) {
			Reserva reserva = new Reserva(inquilino, propiedad, periodo);
			propiedad.agregarReserva(reserva);
			inquilino.agregarReserva(reserva);
			return reserva;
		}
		return null;
	}
	
	public double calcularPrecioReserva(Reserva reserva) {
		return reserva.calcularPrecio();
	}
	
	// ¿?
	public void eliminarReserva(Reserva reserva) {
		if (reserva.getPeriodo().getFrom().isAfter(LocalDate.now())) {
			
		}
	}
	
}
