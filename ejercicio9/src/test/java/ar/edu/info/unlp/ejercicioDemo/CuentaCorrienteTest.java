package ar.edu.info.unlp.ejercicioDemo;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;


public class CuentaCorrienteTest {

    CuentaCorriente cuentaC;
	
	@BeforeEach
	void setUp() throws Exception {
		cuentaC = new CuentaCorriente();
		cuentaC.depositar(100);
	}
	
	@Test
	public void testDepositar() {
		assertEquals(98 ,cuentaC.getSaldo());
	}
	
	@Test
	public void testPuedeExtraer() {
		assertTrue(cuentaC.puedeExtraer(3));
		assertFalse(cuentaC.puedeExtraer(300));
	}
	
	
	@Test
	public void testTransferirCuenta() {
		CuentaCorriente cuenta = new CuentaCorriente();
		
		assertTrue(cuentaC.transeferirACuenta(55, cuenta)); // Si le deposita 55 se le deposita 55 - 55*0.002
		assertTrue(cuenta.puedeExtraer(50)); 
		// cuenta.setLimiteDescubierto(20); // osea si cuenta es una cuenta corriente no tiene limite descubierto
		assertFalse(cuenta.puedeExtraer(120));
	}
}
