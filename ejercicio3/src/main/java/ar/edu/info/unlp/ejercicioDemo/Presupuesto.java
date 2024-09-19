package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Presupuesto{
	
	private LocalDate fecha;
	private String cliente;
	private List<Item> items;
	
	public Presupuesto(String cliente) {
		this.fecha = LocalDate.now();
		this.cliente = cliente;
		this.items = new ArrayList<Item>();
	}
	
	public void agregarItem(Item item) {
		this.items.add(item);
	}
	
	public double calcularTotal() {
		// Calculo el total recorriendo toda la lista y para cada item invocar costo y sumarlo
		double total = 0;
		if(items.isEmpty()) {
			return total; // Si retorno aca siempre voy a retornar 0
		}
		total = items.stream().mapToDouble(Item -> Item.costo()).sum(); // Basicamente suma a total el Item.costo() de TODOS los items de la lista 
		return total;
	}
	
	// Getters

	public LocalDate getFecha() {
		return fecha;
	}


	public String getCliente() {
		return cliente;
	}


	
	
	
	
	
}
