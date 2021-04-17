package com.co.vectores;

import java.util.Scanner;

public class Practica1 {

	public static void main(String[] args) {
		
		//  Suma y promedio de  un arreglo
		
		Scanner sc = new Scanner (System.in);
		double suma = 0;
		double promedio = 0;
		
		
		double [] miArreglo = new double [5];
		
		for (int i = 0; i < miArreglo.length; i++) {
			
			System.out.println("Ingrese Numero " + i);
			miArreglo[i] = sc.nextDouble();
			suma = suma + miArreglo[i];
			
		}
		
		promedio = suma / 5;
		
		System.out.println("La suma total del arreglo es " + suma);
		System.out.println("El promedio total del arreglo es " + promedio);
		
		
	 
	
	 
	  
	  
	  
	  
	}
	 
	
}
	  