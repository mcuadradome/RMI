package com.uniminuto.rmi;


import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;



public class Server {

	public static void main(String[] args) throws RemoteException, MalformedURLException {
		
		
		try {
			
			System.err.println("Server ready");
			
			Registry registro;

            try {
                registro = LocateRegistry.getRegistry(Registry.REGISTRY_PORT);
            }
            catch (RemoteException e) { 
                registro = LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
            }
            
			VueloImpl server = new VueloImpl();
		//	registro.rebind(VueloImpl.RMI_NAME, server);
		//	Registry reg = LocateRegistry.getRegistry("127.0.0.1", 1099);
			
			Naming.rebind("rmi://192.168.1.185:6789/rmiServer", server);  
		
//            IVuelo stub = (IVuelo) UnicastRemoteObject.exportObject(server, 0);  
//            Registry registry = LocateRegistry.getRegistry(); 
//           
//            registry.bind("rmiServer", stub);  
            System.err.println("Server has been started"); 
	         
		} catch (Exception e) {
			System.err.println("Error crear servicio " + e.getMessage());
		}
		  
          
	}

}
