

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;


public class VueloImpl  extends UnicastRemoteObject implements IVuelo {

	private static final long serialVersionUID = 1L;
	public static final String RMI_NAME = "server";

//	private final Registry registry;

//	public VueloImpl(Registry registry) throws RemoteException {
//		super();
//		this.registry = registry;
//	}
//	
	public VueloImpl() throws RemoteException {
		super();
	}
//	
	@Override
	public void registerAeroPuerto(Aeropuerto aropuerto) throws RemoteException {
		System.out.println("Aeropuerto registrado");
	}

	@Override
	public void findAeroPuerto(String aropuerto) throws RemoteException {
		System.out.println("Aeropuerto registrado");

	}

	@Override
	public void deleteAeroPuerto(String aropuerto) throws RemoteException {
		System.out.println("Aeropurto registrado");
	}

	@Override
	public void registerAvion(Avion avion) throws RemoteException {
		System.out.println("Aeropurto registrado");
	}

	@Override
	public void findAvion(String avion) throws RemoteException {
		System.out.println("Aeropurto registrado");
	}

	@Override
	public void deleteAvion(String avion) throws RemoteException {
		System.out.println("Aeropurto registrado");
	}

	@Override
	public void registerPais(Pais pais) throws RemoteException {
		System.out.println("Aeropurto registrado");
	}

	@Override
	public void findPais(String pais) throws RemoteException {
		System.out.println("Aeropurto registrado");
	}

	@Override
	public void deletePais(String pais) throws RemoteException {
		System.out.println("Aeropurto registrado");
	}

	@Override
	public void registerRuta(Ruta ruta) throws RemoteException {
		System.out.println("Aeropurto registrado");
	}

	@Override
	public void findRuta(String ruta) throws RemoteException {
		System.out.println("Ruta a buscar " + ruta);
	}

	@Override
	public void deleteRuta(String ruta) throws RemoteException {
		System.out.println("Aeropurto registrado");
	}

}
