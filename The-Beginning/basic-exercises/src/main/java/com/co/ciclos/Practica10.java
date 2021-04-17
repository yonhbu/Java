package com.co.ciclos;

import java.util.Scanner;

public class Practica10 {

	public static void main(String[] args) {
		
		
	    int i = 1;
	    int sumaPar = 0;
	    int sumaImpar = 0;
	    
	    for (i = 2; i <= 49; i++) {
	    	 if (i%2 == 0) {
	    		 sumaPar =  sumaPar + i;
	    	 }else {
	    		 sumaImpar =  sumaImpar + i;
	    	 }
	    	
			
		}
	    	System.out.println("La suma Par es de " + sumaPar);
	    	System.out.println("La suma imPar es de " + sumaImpar);
	

	}

}
