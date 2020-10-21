package com.uniminuto.rmi;


import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IVuelo  extends Remote {

	
	public void registerAeroPuerto(Aeropuerto aropuerto) throws RemoteException;
	public void findAeroPuerto(String aropuerto) throws RemoteException;
	
	public Avion findAvion(String pais, String avion) throws RemoteException;
	
	public Ruta findRuta(String pais,String matricula) throws RemoteException;
//	public void deleteRuta(String ruta) throws RemoteException;
	
	
}
