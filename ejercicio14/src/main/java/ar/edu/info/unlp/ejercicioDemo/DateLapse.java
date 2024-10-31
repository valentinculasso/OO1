package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse implements Date{
	
	private LocalDate from;
	private LocalDate to;
	
	
	public DateLapse(LocalDate primera, LocalDate segunda) {
		this.from = primera;
		this.to = segunda;
	}
	
	public LocalDate getFrom() {
		return this.from;
	}
	
	public LocalDate getTo() {
		return this.to;
	}
	
	public int sizeInDays() {
		//Retorna la cant de dias entre la fecha FROM y la fecha TO.
		return (int) ChronoUnit.DAYS.between(this.from, this.to);
	}
	
	public boolean includesDate(LocalDate other) {
		//Recibe un objeto LocalDate y retorna true si la fecha está entre el FROM y
		// el TO del receptor y false en caso contrario.
		
		
		return (other.equals(this.from) || other.equals(this.to) || 
				(other.isBefore(this.to) && other.isAfter(this.from)) );
	}
	
}
