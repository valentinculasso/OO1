package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class UsuarioTest {
	
	DateLapse periodo;
	LocalDate inicio= LocalDate.of(10, 2, 10);
	LocalDate fin= LocalDate.of(10, 3, 10);
	
	Usuario valentin;
	Propiedad casa;
	Propiedad hotel;
	
	Sistema sistema;
	
	
	@BeforeEach
	void setUp() throws Exception {
		sistema = new Sistema();
		valentin = new Usuario("Valentin", "La Plata", 4189);
		sistema.registrarUsuario(valentin);
		periodo = new DateLapse(inicio,fin);
		
		
		casa = new Propiedad("48 y 8", "Departamento", 20.0, valentin);
		hotel = new Propiedad("50 y 7", "Hotel 50", 10.0, valentin);
	}
	
    @Test
    public void testPropiedades() {

    }
}