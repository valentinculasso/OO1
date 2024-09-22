package ar.edu.info.unlp.ejercicio2Balanza;
import java.time.LocalDate;

public class Ticket extends Object{
	
	private LocalDate fecha;
	private int cantidadDeProductos;
	private double pesoTotal;
	private double precioTotal;
	
	public Ticket(int productos, double peso, double precio) {
		this.fecha= LocalDate.now();
		this.cantidadDeProductos= productos;
		this.pesoTotal= peso;
		this.precioTotal= precio;
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
