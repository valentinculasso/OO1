package ar.edu.info.unlp.ejercicioDemo;

public class Reserva {
	
	private Usuario propietario;
	private Propiedad propiedad;
	private DateLapse periodo;
	
	public Reserva(Usuario propietario, Propiedad propiedad, DateLapse periodo) {
		this.propietario = propietario;
		this.propiedad = propiedad;
		this.periodo = periodo;
	}
	
	public DateLapse getPeriodo() {
		return this.periodo;
	}
	
	public boolean cumple(DateLapse periodo) {
		return this.periodo.overlaps(periodo);
	}
	
	public double calcularPrecio() {
		return periodo.sizeInDays() * propiedad.getPrecio();
	}
}
