package com.co.ciclos;

import java.util.Scanner;

public class Practica14 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner (System.in);	
		int numero = 0;
		int iterador = 1;
		double suma = 0;
		
		
	    System.out.println("Cuantos Numeros Desea Iterar?");
	    numero = sc.nextInt();
	    
	    while (iterador <= numero) {
	    	
	    	suma = suma + Math.pow(iterador, 2);
	    	iterador = iterador + 1;
	    
	    }
	    
	    System.out.println("La suma es " + suma);

	}

}
