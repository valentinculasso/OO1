package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class Ejercicio8Test {
	
	Gerente alan = new Gerente("Alan Turing");
	double aportesDeAlan = alan.aportes();
	
	// Gerente alan = new Gerente("Alan Turing");
	double sueldoBasicoDeAlan = alan.sueldoBasico();
	
	void test() {
		assertEquals(59850, alan.sueldoBasico()); // El sueldo basico de alan deberia ser de 59850 (57000 + 2850, osea montoBasico + aportes)
		
		assertEquals(2850, alan.aportes()); // Los aportes de alan deberian ser de 2850 (57000 * 0.05)
	}
}
