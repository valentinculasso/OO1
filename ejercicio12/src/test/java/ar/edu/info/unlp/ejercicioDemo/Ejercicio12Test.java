package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio12Test {

	ReporteDeConstruccion reporte;
	Esfera esfera;
	Cilindro cilindro;
	PrismaRectangular prisma;
	
	
	@BeforeEach
	void setUp() {
		 reporte = new ReporteDeConstruccion();
		 esfera = new Esfera("Hierro", "Rojo", 10);
		 cilindro = new Cilindro("Aluminio", "Verde", 10, 2);
		 prisma = new PrismaRectangular("Hierro", "Verde", 5, 5, 1);
	}
	
	@Test
	public void testVolumen() {
		assertEquals(2356, Math.round(esfera.volumen())); // 2356.19449
		assertEquals(1257,Math.round(esfera.superficie()));
		assertEquals(628, Math.round(cilindro.volumen()));
		assertEquals(754,Math.round(cilindro.superficie()));
		assertEquals(25, Math.round(prisma.volumen()));
		assertEquals(70,Math.round(prisma.superficie()));
	}
	
	@Test
	public void testReportes() {
		reporte.agregarPieza(esfera);
		reporte.agregarPieza(cilindro);
		reporte.agregarPieza(prisma);
		assertEquals(2381 ,Math.round(reporte.volumenDeMaterial("Hierro")));
		assertEquals(628 ,Math.round(reporte.volumenDeMaterial("Aluminio")));
		assertEquals(1257, Math.round(reporte.superficieDeColor("Rojo")));
    	assertEquals(824, Math.round(reporte.superficieDeColor("Verde")));
	}	
	
}
