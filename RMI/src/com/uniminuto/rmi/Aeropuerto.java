package com.uniminuto.rmi;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;

public class Aeropuerto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String pais;
	private ArrayList<Avion> aviones;
	private Map<String,Ruta> rutas;
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public ArrayList<Avion> getAviones() {
		return aviones;
	}
	public void setAviones(ArrayList<Avion> aviones) {
		this.aviones = aviones;
	}
	
	public Map<String, Ruta> getRutas() {
		return rutas;
	}
	public void setRutas(Map<String, Ruta> rutas) {
		this.rutas = rutas;
	}

	

}
