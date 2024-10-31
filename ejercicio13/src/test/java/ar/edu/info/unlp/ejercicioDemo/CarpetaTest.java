package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarpetaTest {

	private Carpeta carpeta;
	private Carpeta carpeta2;
	private Email email1;
	private Email email2;
	private Email email3;

	@BeforeEach
	private void initialize() {
		email1 = new Email("email1", "cuerpo1");
		email2 = new Email("email2", "cuerpo2");
		email3 = new Email("emial3","cuerpo3");
		carpeta = new Carpeta("Nombre");
		carpeta.agregarMail(email1);
		carpeta.agregarMail(email2);
		carpeta.agregarMail(email3);
	}
	
	@BeforeEach
    public void setUp() {
        this.initialize();
    }
	
	@Test
	public void testAgregar() {
		assertEquals(3,carpeta.getEmails().size());
	}
	
	@Test
	public void TestValorEmails() {
		assertEquals(39,carpeta.valorEmails());
	}
	
	@Test
	public void TestBuscarMail() {
		assertEquals(email1,carpeta.buscarMail("cuerpo1"));
	}
	
	@Test
	public void TestMover() {
		carpeta2 = new Carpeta(" ");
		assertEquals(0,carpeta2.getEmails().size());
		carpeta.mover(email2, carpeta2);
		assertEquals(1,carpeta2.getEmails().size());
		assertEquals(email2,carpeta2.buscarMail("cuerpo2"));
	}
	
}