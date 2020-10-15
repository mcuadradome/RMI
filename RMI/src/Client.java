

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;



public class Client {

	private static IVuelo look_up;
	
	public static void main(String[] args) throws RemoteException, MalformedURLException {
		
		
		try {
			
			System.out.println("Buscando Objeto ");	
			
//			Registry reg = LocateRegistry.getRegistry("127.0.0.1", 1099);
						
			look_up = (IVuelo) Naming.lookup("rmi://127.0.0.1:5000/rmiServer");
//
//			look_up.findRuta("");
			
	//		Registry registry = LocateRegistry.getRegistry(null); 
		    
	         // Looking up the registry for the remote object       
	         look_up.findRuta("Cali");
			
		} catch ( RemoteException | NotBoundException e) {		
			e.printStackTrace();
		}

	       
		
		
		

	}

}
