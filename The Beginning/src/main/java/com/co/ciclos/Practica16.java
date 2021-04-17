package com.co.ciclos;

import java.util.Scanner;

public class Practica16 {

	public static void main(String[] args) {
		
		//Suma iterativa de cuadrados
		
		
		Scanner sc = new Scanner (System.in);	
		int n = 0;
		int numero2 = 0;
		int iterador = 1;
		int suma = 0;
	
		
		System.out.println("Cantidad de Numeros a Sumar?");
		n = sc.nextInt();
		
		while(iterador <= n) {
			
			System.out.println("Ingrese numeros " + iterador);
			numero2 = sc.nextInt();
			suma = (int) (suma + Math.pow(numero2, 2));
			iterador = iterador + 1;
			
		}
		
		System.out.println("La suma es " + suma);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		
		

	}

}
