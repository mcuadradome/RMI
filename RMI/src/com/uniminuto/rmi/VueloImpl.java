package com.uniminuto.rmi;


import java.lang.annotation.Retention;
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
		if(!vuelo.containsKey(aeropuerto.getPais())) {
			vuelo.put(aeropuerto.getPais(), aeropuerto);
			System.out.println("Vuelo registrado");
		}else {
			System.out.println("Aeropuerto ya existe");
		}
		
	}

	@Override
	public void findAeroPuerto(String aropuerto) throws RemoteException {
		System.out.println("Aeropuerto registrado");
	}

	@Override
	public Avion findAvion(String pais, String avion) throws RemoteException {
		try {
			if(vuelo.containsKey(pais)) {
				for(Map.Entry<String, Aeropuerto> entry : vuelo.entrySet()) {
					Aeropuerto aero = entry.getValue();
					
					for (Avion obj : aero.getAviones()) {
						if(obj.getMatricula().equals(avion)) {
							return obj;
						}
					}
				}
			}
		
		} catch (Exception e) {
			System.out.println("Error " + e.getMessage());
			
		}
		return null;
	}

	@Override
	public Ruta findRuta(String pais, String matricula) throws RemoteException {
		System.out.println("Ruta a buscar " + matricula);
		try {
			if(vuelo.containsKey(pais)){
				Aeropuerto aero= vuelo.get(pais);
				
				if(aero.getRutas().containsKey(matricula)) {
					return aero.getRutas().get(matricula);
				}else {
					return null;
				}
			}
		} catch (Exception e) {
			System.out.println("Error " + e.getMessage());			
		}
		return null;
	
	}


}
