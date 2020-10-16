package com.uniminuto.rmi;


import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.LinkedHashMap;
import java.util.Map;


public class VueloImpl  extends UnicastRemoteObject implements IVuelo {

	private static final long serialVersionUID = 1L;
	public Map<String, Aeropuerto> vuelo = new LinkedHashMap<String, Aeropuerto>(); 
	//private final Registry registry;

//	public VueloImpl(Registry registry) throws RemoteException {
//		super();
//		this.registry = registry;
//	}

	
	public VueloImpl() throws RemoteException {
		super();
	}

	@Override
	public void registerAeroPuerto(Aeropuerto aeropuerto) throws RemoteException {
		vuelo.put(aeropuerto.getPais(), aeropuerto);
		System.out.println("Aeropuerto registrado");
	}

	@Override
	public void findAeroPuerto(String aropuerto) throws RemoteException {
		System.out.println("Aeropuerto registrado");
	}

	@Override
	public void findAvion(String avion) throws RemoteException {
		System.out.println("Aeropurto registrado");
	}

	@Override
	public void findRuta(String ruta) throws RemoteException {
		System.out.println("Ruta a buscar " + ruta);
	}


}
