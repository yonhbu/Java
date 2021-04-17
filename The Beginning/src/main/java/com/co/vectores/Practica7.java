package com.co.vectores;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
;

public class Practica7 {


	public static void main(String[] args) {
		
		final  Logger loguer = Logger.getLogger("practica_Enero_Arreglos.Practica7");
		
		int []  vector = new int [4];
		int ultimo = 0;
		

		Scanner sc = new Scanner (System.in);
		
		for (int i = 0; i < vector.length; i++) {
			
			loguer.log(Level.OFF, "Ingrese Numero {0} ", (i + 1));
			vector [i] = sc.nextInt();
		}
		
		ultimo = vector[3];
		
		
		for (int x = 2; x >= 0; x--) {
			
			
			vector [x + 1] = vector [x];
			

		}
		
		vector[0] = ultimo;
		
		
		for (int y = 0; y < vector.length; y++) {
			
			loguer.log(Level.INFO, "Exitoso {0}", vector[y]);


		}
		
		
		
		
		
	}

	
}


