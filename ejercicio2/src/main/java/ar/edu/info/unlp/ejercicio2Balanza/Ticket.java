package ar.edu.info.unlp.ejercicio2Balanza;
import java.time.LocalDate;

public class Ticket extends Object{
	
	private LocalDate fecha;
	private int cantidadDeProductos;
	private double pesoTotal;
	private double precioTotal;
	
	public Ticket() {
		this.fecha= LocalDate.now();
		this.cantidadDeProductos= 0;
		this.pesoTotal= 0;
		this.precioTotal= 0;
	}
	
	//GETTERS Y SETTERS
	public LocalDate getFecha() {
		return fecha;
	}

	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}

	public double getPesoTotal() {
		return pesoTotal;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	// METODOS
	public void agregarProducto(double pesoT, double precioT) {
		this.pesoTotal+= pesoT;
		this.precioTotal+= precioT;
		this.cantidadDeProductos++;
	}
	
	public double impuesto() {
		return 21*this.precioTotal/100;
	}
}
