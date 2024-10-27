package ar.edu.info.unlp.ejercicioDemo;

public class CuentaCorriente extends Cuenta{
	
	public CuentaCorriente() {
		super();
	}
	
	protected boolean puedeExtraer(double monto) {
		return this.getSaldo() >= (monto + (monto*0.02));
	}
	
	public void depositar(double monto) {
		super.depositar((monto - monto*0.02));
	}
	
	public boolean extraer(double monto) {
		return super.extraer((monto - monto*0.02));
	}
	
	public boolean transferirACuenta(double monto, Cuenta cuentaDestino) {
		return super.transeferirACuenta((monto - monto*0.02), cuentaDestino);
	}
}
