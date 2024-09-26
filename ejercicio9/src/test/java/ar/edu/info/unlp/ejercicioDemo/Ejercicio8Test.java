package ar.edu.info.unlp.ejercicioDemo;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class Ejercicio8Test {
	
	public static void main(String[] args) {
		Gerente alan = new Gerente("Alan Turing");
		double aportesDeAlan = alan.aportes();
		System.out.println(aportesDeAlan); // retorna 2850
		
		double sueldoBasicoDeAlan = alan.sueldoBasico();
		System.out.println(sueldoBasicoDeAlan); // retorna 59850s
	}
}
