

import java.io.Serializable;
import java.util.ArrayList;

public class Aeropuerto implements Serializable {

	/**
	 * 
	 */
	private static long serialVersionUID = 9088206843315557477L;
	
	private Pais pais;
	private ArrayList<Avion> aviones;
	private ArrayList<Ruta> rutas;
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public static void setSerialversionuid(long serialversionuid) {
		serialVersionUID = serialversionuid;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
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
