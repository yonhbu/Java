package com.co.vectores;

import java.util.Scanner;

public class Practica4 {

	public static void main(String[] args) {
		
		// Hallar el n�mero mayor y menor de un arreglo
		
				Scanner sc = new Scanner (System.in);	
				int n = 0;
				
				
				System.out.println("Ingrese tama�o del arreglo");
				n = sc.nextInt();
				
				int [] arreglo = new int [n];
				int mayor = 0;
				int menor = 0;
				
				for (int i = 0; i < arreglo.length; i++) {
					
					mayor = arreglo [0];
					menor = arreglo [0];

					System.out.println(i + 1 + " Ingrese valor "  );
					arreglo[i] = sc.nextInt();
					
					if (arreglo[i] > mayor  ) {
						mayor = arreglo [i];
					} else if (arreglo[i] < menor  )  {
						menor = arreglo [i];
					}
					
				}
				
				System.out.println("Dato Mayor Ingresado es " + mayor);
				System.out.println("Dato Menor Ingresado es " + menor);
				
			

}
	
}
