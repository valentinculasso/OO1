package ar.edu.info.unlp.ejercicio2Balanza;

import java.util.ArrayList;
import java.util.List;

public class Balanza extends Object{
	
	private List<Producto> cantidadDeProductos;
	
	
	public Balanza() {
		this.cantidadDeProductos = new ArrayList<Producto>();
	}
	
	// METODOS
	
	// Lista vacia
	public void ponerEnCero() {
		this.cantidadDeProductos = new ArrayList<>();
	}
	
	// Agrega un producto a la lista
	public void agregarProducto(Producto producto) {
		this.cantidadDeProductos.add(producto);
	}
	
	// Recorre la lista tomando el metodo getPrecio y sumandolo
	public double getPrecioTotal() {
		return cantidadDeProductos.stream()
				.mapToDouble(producto -> producto.getPrecio())
				.sum();
	}
	// Recorre la lista tomando el peso de cada producto y lo va sumando
	public double getPesoTotal() {
		return cantidadDeProductos.stream()
				.mapToDouble(producto -> producto.getPeso())
				.sum();
	}
	// Retorna la cantidad de productos de la lista
	public int getCantidadDeProductos() {
		return (int) cantidadDeProductos.stream().count();
	}
	
	public Ticket emitirTicket() {
		Ticket ticket = new Ticket(this.getCantidadDeProductos(),this.getPesoTotal(),this.getPrecioTotal());
		ponerEnCero(); // yo una vez que genero el ticket pongo en cero la balanza para que sea usada nuevamente
		return ticket;
	}
	
	public List<Producto> getProductos(){
		return new ArrayList<Producto>(this.cantidadDeProductos);
	}
	
}
