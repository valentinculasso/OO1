package ar.edu.info.unlp.ejercicioDemo;

public class CajaDeAhorro extends Cuenta{
	
	private double limiteDescubierto;
	
	public CajaDeAhorro() {
		super();
		this.limiteDescubierto = 0;
	}
	
	public double getLimiteDescubierto() {
		return limiteDescubierto;
	}

	public void setLimiteDescubierto(double nuevoLimite) {
		this.limiteDescubierto = nuevoLimite;
	}

	protected boolean puedeExtraer(double monto) {
		// uso super o this??
		return (this.getSaldo()+this.getLimiteDescubierto()) >= monto;
	}
}
