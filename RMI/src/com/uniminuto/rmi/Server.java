package com.uniminuto.rmi;


import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;



public class Server {

	public static void main(String[] args) throws RemoteException, MalformedURLException {
		
		
		try {
			
			System.err.println("Server ready");
			          
			VueloImpl server = new VueloImpl(); 
			//Registry reg = LocateRegistry.getRegistry();
			
			Naming.rebind("rmi://localhost/rmiServer", server);  
		
//            IVuelo stub = (IVuelo) UnicastRemoteObject.exportObject(server, 0);  
//            Registry registry = LocateRegistry.getRegistry(); 
//           
           // reg.bind("rmiServer", stub);  
            System.err.println("Server has been started"); 
	         
		} catch (Exception e) {
			System.err.println("Error crear servicio " + e.getMessage());
		}
		  
          
	}

}
