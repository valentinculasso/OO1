package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArchivoTest {
	
	Archivo archivo;
	Archivo archivo2;
	
	private void initialize() {
		archivo = new Archivo("Nombre");
		archivo2 = new Archivo("");
	}
	
	@BeforeEach
    public void setUp() {
        this.initialize();
    }
	
	@Test
	public void testTamaño() {
		assertEquals(6,archivo.tamaño());
		assertEquals(0,archivo2.tamaño());
	}
	

}
