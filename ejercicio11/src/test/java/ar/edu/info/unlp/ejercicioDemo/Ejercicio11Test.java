package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio11Test {

	Inversor inversor;
	InversionEnAcciones acciones;
	PlazoFijo plazoFijoV;
	
	@BeforeEach
	void setUp() throws Exception {
		 inversor = new Inversor("Valentin");
		 acciones = new InversionEnAcciones("Accion MercadoLibre", 500, 3);
		 plazoFijoV = new PlazoFijo(LocalDate.of(2024, 10, 24), 10.0, 20.0);
	}
	
	@Test
	public void testAcciones() {
		assertEquals(1500,acciones.valorActual());
	}
	
	// 7 dias de diferencia
	@Test
	public void testPlazoFijo() {
		assertEquals(1410,plazoFijoV.valorActual());
	}
	
	@Test
	public void testInversor() {
		assertEquals(0,inversor.valorActual());
		inversor.agregarInversion(acciones);
		assertEquals(1500,inversor.valorActual());
		inversor.agregarInversion(plazoFijoV);
		assertEquals(2910,inversor.valorActual());
	}
	
	
	
}
