package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.ArrayList;

public class EmailTest {
	
	Email email;
	Email email2;
	
	private void initialize() {
		List<Archivo> lista = new ArrayList<Archivo>();
		lista.add(new Archivo("Nombre1"));
		lista.add(new Archivo("Nombre2"));
		email = new Email("Titulo","Cuerpo");
		email2 = new Email("Lista","Pasamos una lista creada",lista);
	}
	
	@BeforeEach
    public void setUp() {
        this.initialize();
    }
	
	@Test
	public void testGetters() {
		assertEquals("Titulo",email.getTitulo());
		assertEquals("Cuerpo",email.getCuerpo());
		assertEquals(0,email.adjuntos().size());
		
		assertEquals("Lista",email2.getTitulo());
		assertEquals("Pasamos una lista creada",email2.getCuerpo());
		assertEquals(2,email2.adjuntos().size());
	}
	
	@Test
	public void testContiene() {
		assertEquals(true,email2.contiene("Lista"));
		assertEquals(true,email.contiene("Cuerpo"));
		
		assertEquals(false,email2.contiene("no"));
		assertEquals(false,email.contiene("nada"));
	}
	
	@Test
	public void testEspacio() {
		assertEquals(12,email.getEspacioOcupado());
		assertEquals(43,email2.getEspacioOcupado());
	}
	
}