package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PlazoFijo implements Inversiones{
	
	private LocalDate fecha;
	private double montoDepositado;
	private double porcentajeDeInteresDiario;
	
	public PlazoFijo(double unMontoDepositado, double PorcentajeDeInteresDiario) {
		this.fecha = LocalDate.now();
		this.montoDepositado = unMontoDepositado;
		this.porcentajeDeInteresDiario = PorcentajeDeInteresDiario;
	}
	
	public PlazoFijo(LocalDate fecha, double unMontoDepositado, double PorcentajeDeInteresDiario) {
		this.fecha = fecha;
		this.montoDepositado = unMontoDepositado;
		this.porcentajeDeInteresDiario = PorcentajeDeInteresDiario;
	}
	
	
	public double valorActual() {
		double dias = ChronoUnit.DAYS.between(fecha, LocalDate.now());
		return this.montoDepositado + (this.montoDepositado*this.porcentajeDeInteresDiario*dias);
	}
	
}
