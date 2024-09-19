package ar.edu.info.unlp.ejercicio2Balanza;

public class Balanza extends Object{
	
	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	private Ticket ticket;
	
	
	public Balanza() {
		this.cantidadDeProductos = 0;
		this.precioTotal = 0;
		this.pesoTotal = 0;
		this.ticket = new Ticket();
	}
	
	//GETTERS Y SETTERS
	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}

	public void setCantidadDeProductos(int cantidadDeProductos) {
		this.cantidadDeProductos = cantidadDeProductos;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}

	public double getPesoTotal() {
		return pesoTotal;
	}

	public void setPesoTotal(double pesoTotal) {
		this.pesoTotal = pesoTotal;
	}

	//FIN GETTERS Y SETTERS
	
	// METODOS
	public void ponerEnCero() {
		this.pesoTotal= 0;
		this.precioTotal= 0;
		this.cantidadDeProductos= 0;
	}
	
	public void agregarProducto(Producto producto) {
		this.pesoTotal += producto.getPeso();
		this.precioTotal += producto.getPrecio();
		this.cantidadDeProductos++;
		ticket.agregarProducto(producto.getPeso(), producto.getPrecio());
	}
	
	public Ticket emitirTicket() {
		return ticket;
	}
	
	
}
