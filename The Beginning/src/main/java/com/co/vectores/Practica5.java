package com.co.vectores;

import java.util.Scanner;

public class Practica5 {

	public static void main(String[] args) {
		
		// Mostrar un arreglo mediante los extremos
		
				Scanner sc = new Scanner (System.in);
				
				
				int [] arreglo = new int [4];
		
				
				for (int i = 0; i < arreglo.length; i++) {

					System.out.println(i + 1 + " Ingrese valor "  );
					arreglo[i] = sc.nextInt();
					
				}
				
				 for (int x = 0; x < 2; x++){
			            System.out.println(arreglo[x] + " " + arreglo[3-x] + " ");
			        }
				

				
			

}
	
}
