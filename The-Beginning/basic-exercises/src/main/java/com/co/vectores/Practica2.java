package com.co.vectores;

import java.util.Scanner;

public class Practica2 {

	public static void main(String[] args) {
		
		//Llenar un arreglo con N�meros aleatorios
		
		Scanner sc = new Scanner (System.in);	
		int n = 0;
		
		System.out.println("Ingrese tama�o del arreglo");
		n = sc.nextInt();
		
		int [] arreglo = new int [n];

		
		for (int i = 0; i < arreglo.length; i++) {
			
			arreglo [i] = (int) (Math.random() * 100) + 1;
			System.out.println(arreglo [i]);
			
		}
		

		
		
		
	}

}
