package com.uniminuto.rmi;


import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IVuelo  extends Remote {

	
	public void registerAeroPuerto(Aeropuerto aropuerto) throws RemoteException;
	public void findAeroPuerto(String aropuerto) throws RemoteException;
	
	public void findAvion(String matricula) throws RemoteException;
	
	public void findRuta(String ruta) throws RemoteException;
//	public void deleteRuta(String ruta) throws RemoteException;
	
	
}
