package com.uniminuto.rmi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Utils {

	
	private final static String[] modelo;   
    private final static String[] aviones;
    private final static char[] letters;
 
    
	static {
		modelo = new String[5];
		aviones = new String[5];
		letters = new char[5];
		
		aviones[0] = "Boeing";
		aviones[1] = "Airbus";
		aviones[2] = "Embraer";
		aviones[3] = "BOMBARDIER";
		aviones[4] = "McDonnell Douglas";
		aviones[5] = "Concorde";
		
		modelo[0] = "737";
		modelo[1] = "578";
		modelo[2] = "206";
		modelo[3] = "757";
		modelo[4] = "747";
		modelo[5] = "707";
		
		letters[0] = 'X';
		letters[1] = 'A';
		letters[2] = 'F';
		letters[3] = 'U';
		letters[4] = 'G';
		letters[5] = 'E';
		
	}
	
	public static List<Avion> createAvion(int size) {
        List<Avion> list = new ArrayList<Avion>();
        for(int i = 0 ; i < size ; i++) {
            list.add(new Avion(null,getRandomMatricula(), getRandomBrand(), getRandomPasajeros(), null));
        }
         
        return list;
    }
	
	private static String getRandomMatricula() {
		char let= letters[(int) (Math.random() * 5)];
		return let+"-"+String.valueOf(getRandomNumberr());
    }
	
	private static int getRandomNumberr() {
        return (int) (Math.random() * 50 + 2020);
    }
	
	private static int getRandomPasajeros() {
        return (int) (Math.random() * 50 + 200);
    }
	
	public static int getRandomHora(int num1, int num2) {
        return (int) (Math.random() * num1 + num2);
    }
	
	private static String getRandomBrand() {
        String avi= aviones[(int) (Math.random() * 5)];
        String mod = modelo[(int) (Math.random() * 5)];
        return avi+"-"+mod;
    }
	
	public List<String> getBrands() {
        return Arrays.asList(aviones);
    }
	
	
}
