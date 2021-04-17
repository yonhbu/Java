package com.co.vectores;

import java.util.Scanner;

public class Practica3 {

	public static void main(String[] args) {
		
		// Imprimir en orden inverso un arreglo
		
		Scanner sc = new Scanner (System.in);	
		int n = 0;
		
		System.out.println("Ingrese tama�o del arreglo");
		n = sc.nextInt();
		
		int [] arreglo = new int [n];
		
		for (int i = 0; i < arreglo.length; i++) {
			

			System.out.println("Ingrese valor " + i);
			arreglo[i] = sc.nextInt();
			
		}
		
		for (int x = arreglo.length -1; x >= 0 ; x--) {

			System.out.println("Indice  " + x + " =" + arreglo[x]);
			
			
		}
		
           
	}

}
