package com.uniminuto.rmi;


import java.io.Serializable;
import java.util.ArrayList;

public class Avion implements Serializable{

	/**
	 * 
	 */

	
	private static long serialVersionUID = -5645078835050062913L;

	
	
	private Ruta ruta;
	private String matricula;
	private String modelo;
	private int pasajeros;
	private String fechaVuelo;
	
	
	public Avion(Ruta ruta, String matricula, String modelo, int pasajeros, String fechaVuelo) {
		super();
		this.ruta = ruta;
		this.matricula = matricula;
		this.modelo = modelo;
		this.pasajeros = pasajeros;
		this.fechaVuelo = fechaVuelo;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public static void setSerialversionuid(long serialversionuid) {
		serialVersionUID = serialversionuid;
	}
	public Ruta getRuta() {
		return ruta;
	}
	public void setRuta(Ruta ruta) {
		this.ruta = ruta;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public int getPasajeros() {
		return pasajeros;
	}
	public void setPasajeros(int pasajeros) {
		this.pasajeros = pasajeros;
	}
	public String getFechaVuelo() {
		return fechaVuelo;
	}
	public void setFechaVuelo(String fechaVuelo) {
		this.fechaVuelo = fechaVuelo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
	
}
