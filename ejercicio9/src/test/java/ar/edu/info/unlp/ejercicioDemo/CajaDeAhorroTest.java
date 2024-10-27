package ar.edu.info.unlp.ejercicioDemo;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;


public class CajaDeAhorroTest {

    CajaDeAhorro caja;
	
	@BeforeEach
	void setUp() throws Exception {
		caja = new CajaDeAhorro();
		caja.depositar(100);
	}
	
	@Test
	public void testDepositar() {
		assertEquals(100 ,caja.getSaldo());
	}
	
	@Test
	public void testPuedeExtraer() {
		assertTrue(caja.puedeExtraer(3));
		assertFalse(caja.puedeExtraer(300));
	}
	
	@Test
	public void testLimiteDescubierto() {
		caja.setLimiteDescubierto(20);
		assertEquals(20, caja.getLimiteDescubierto()); // saldo 100 - limiteD 20 = 120
		assertFalse(caja.puedeExtraer(121));
	}
	
	@Test
	public void testTransferirCuenta() {
		CuentaCorriente cuenta = new CuentaCorriente();
		
		assertTrue(caja.transeferirACuenta(55, cuenta)); // Si le deposita 55 se le deposita 55 - 55*0.002
		assertTrue(cuenta.puedeExtraer(50)); 
		// cuenta.setLimiteDescubierto(20); // osea si cuenta es una cuenta corriente no tiene limite descubierto
		assertFalse(cuenta.puedeExtraer(120));
	}
}