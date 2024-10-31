package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.List;

public class ClienteDeCorreo {
	
	private Carpeta inbox;
	List<Carpeta> carpetas;
	
	public ClienteDeCorreo(Carpeta inbox) {
		this.inbox = new Carpeta("inbox");
		this.carpetas = new ArrayList<Carpeta>();
	}
	
	public void recibir(Email email) {
		this.inbox.agregarMail(email);
	}
	
	// Este metodo retorna el primer email en el Cliente de Correo cuyo título o cuerpo contienen el texto indicado como parámetro. Busca en todas las carpetas. 
	public Email buscar(String titulo) {
		return this.carpetas.stream().map(Carpeta -> Carpeta.buscarMail(titulo)).findFirst().orElse(null);
	}
	
	// retorna la suma del espacio ocupado por todos los emails de todas las carpetas.
	public double espacioOcupado() {
		return this.carpetas.stream().mapToDouble(Carpeta -> Carpeta.valorEmails()).sum();
	}
}
