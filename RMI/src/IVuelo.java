

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IVuelo  extends Remote {

	
	public void registerAeroPuerto(Aeropuerto aropuerto) throws RemoteException;
	public void findAeroPuerto(String aropuerto) throws RemoteException;
	public void deleteAeroPuerto(String aropuerto) throws RemoteException;
	
	public void registerAvion(Avion avion) throws RemoteException;
	public void findAvion(String avion) throws RemoteException;
	public void deleteAvion(String avion) throws RemoteException;
	
	public void registerPais(Pais pais) throws RemoteException;
	public void findPais(String pais) throws RemoteException;
	public void deletePais(String pais) throws RemoteException;
	
	
	public void registerRuta(Ruta ruta) throws RemoteException;
	public void findRuta(String ruta) throws RemoteException;
	public void deleteRuta(String ruta) throws RemoteException;
	
	
}
