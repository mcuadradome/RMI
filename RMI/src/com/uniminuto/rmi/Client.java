package com.uniminuto.rmi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.spi.CalendarNameProvider;


public class Client {

	private static IVuelo look_up;
	private static List<Avion> avion;

	public static void main(String[] args) throws RemoteException, MalformedURLException {

		try {

			//System.out.println("Buscando Objeto ");
			
			look_up = (IVuelo) Naming.lookup("rmi://localhost:5000/rmiServer");
			
			BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
			String aeropuerto=null, pais=null, numeroDespegue=null, destino;
//			Registry reg = LocateRegistry.getRegistry("127.0.0.1", 1099);

			System.out.println("Ingrese Aeropuerto para continuar");
			aeropuerto = obj.readLine();
			System.out.println("Ingrese Pais");
			pais = obj.readLine();
		
			if(pais != null && aeropuerto!= null) {
				System.out.println("Ingrese cuanto aviones salen");
				numeroDespegue = obj.readLine();
				
				int num = Integer.parseInt(numeroDespegue);				
				avion = Utils.createAvion(num);
				ArrayList<Avion> listAviones = new ArrayList<Avion>();
				ArrayList<Ruta> listRuta = new ArrayList<Ruta>();
				Map<String,Ruta> rutasMap = new LinkedHashMap<String, Ruta>();
				Aeropuerto oAeropuerto = new Aeropuerto();
				
				for (int i = 0; i < num; i++) {
					System.out.println("Ingrese Matricula");
					String matricula = obj.readLine();
					Avion avio = look_up.findAvion(pais, matricula);
					if(avio != null) {
						System.out.println("Vuelo " + avio.toString() + "Ya despego");
					}else {
						Avion avi = avion.get(i);
						avi.setMatricula(matricula);
						
						Ruta ruta = new Ruta();
						
						System.out.println("Ingrese Destino para salida " + i+1 + " Avion " + avi.getMatricula());
						destino = obj.readLine();
						Ruta rt= look_up.findRuta(pais, matricula);
						if(rt != null) {
							System.out.println("Ruta ya en uso " + rt.toString());
						}else {
							Tiempo tiempo = new Tiempo();
							tiempo.setHora(Utils.getRandomHora(1,5));
							tiempo.setMinuto(Utils.getRandomHora(1,59));
							tiempo.setSegundos(Utils.getRandomHora(1,59));					
						
							ruta.setTiempo(tiempo);
							ruta.setPaisOrigen(pais);
							ruta.setPaisDestino(destino);
							
							String timeStamp = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
							avi.setFechaVuelo(timeStamp);
							avi.setRuta(ruta);
							
							listAviones.add(avi);
							listRuta.add(ruta);
							rutasMap.put(pais+"-"+destino, ruta);
						}
					}
					
				}
				
				Rutas rutas = new Rutas();
				rutas.setAviones(listAviones);
				rutas.setRutas(listRuta);
				
				oAeropuerto.setPais(pais);
				oAeropuerto.setAviones(listAviones);
				oAeropuerto.setRutas(rutasMap);
				
				look_up.registerAeroPuerto(oAeropuerto);
				
			}
				

		} catch (NotBoundException | IOException e) {
			System.out.println("Error " + e.getMessage());
			e.printStackTrace();
		}

	}

}
