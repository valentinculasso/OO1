package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.info.unlp.ejercicioDemo.DateLapse2;

import java.time.LocalDate;

public class DateLapseTest {
	//Creamos las variables con las fechas
	//Periodo es de tipo date para q se puedan instanciar las dos clases
	Date periodo;
	LocalDate desde = LocalDate.of(2024,5, 1);
	LocalDate hasta = LocalDate.of(2024,5, 30);
	Date periodo2;
	LocalDate desde2 = LocalDate.of(2024, 5, 15);
	LocalDate hasta2 = LocalDate.of(2024,5, 25);
	
	@BeforeEach
	void setUp() throws Exception {
		
		//Inicializamos los periodos.
		//Aca lo que cambia es cual de las dos instancio.
		periodo = new DateLapse(desde, hasta);
		periodo2 = new DateLapse(desde2, hasta2);
		//periodo = new DateLapse2(desde, 29);
		//periodo2 = new DateLapse2(desde2, 10);
	}
    @Test
    public void testCantidadDias() {	
    	//Metodos para testear sizeInDays.
        assertEquals(29, periodo.sizeInDays());
        assertEquals(10, periodo2.sizeInDays());
    }
    @Test
    public void testContieneFecha() {
    	//Metodo para testear includesDate.
        assertTrue(periodo.includesDate(desde2));
        assertTrue(periodo.includesDate(hasta2));
        assertTrue(periodo.includesDate(desde));
        assertTrue(periodo.includesDate(hasta));
    }
}