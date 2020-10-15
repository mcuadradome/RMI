

import java.io.Serializable;
import java.util.ArrayList;

public class Ruta implements Serializable {

	/**
	 * 
	 */
	private static long serialVersionUID = -458618988801946420L;

	private String paisOrigen;
	private String PaisDestino;
	private Tiempo tiempo;
	private ArrayList<Avion> aviones;
	private ArrayList<Ruta> rutas;
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public static void setSerialversionuid(long serialversionuid) {
		serialVersionUID = serialversionuid;
	}
	public String getPaisOrigen() {
		return paisOrigen;
	}
	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}
	public String getPaisDestino() {
		return PaisDestino;
	}
	public void setPaisDestino(String paisDestino) {
		PaisDestino = paisDestino;
	}
	public Tiempo getTiempo() {
		return tiempo;
	}
	public void setTiempo(Tiempo tiempo) {
		this.tiempo = tiempo;
	}
	public ArrayList<Avion> getAviones() {
		return aviones;
	}
	public void setAviones(ArrayList<Avion> aviones) {
		this.aviones = aviones;
	}
	public ArrayList<Ruta> getRutas() {
		return rutas;
	}
	public void setRutas(ArrayList<Ruta> rutas) {
		this.rutas = rutas;
	}
	
	
}
