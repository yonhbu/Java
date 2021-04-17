package com.co.ciclos;

import java.util.Scanner;

public class Practica11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int numero = 0;
		int positivos = 0;
		int negativos = 0;
		int neutros = 0;
		
		for (int i = 1; i<=10; i++) {
			
			System.out.println("Ingrese Numero " + i);
			numero = sc.nextInt();
			
			if (numero > 1) {
				
				positivos = positivos + 1 ;
				
			} else if (numero < 0) {
				
				negativos = negativos + 1 ;
				
			} else if (numero == 0 || numero == 1){				
				
				neutros = neutros + 1;
				
			}
				
			
			
		}
		
		System.out.println("Los numeros positivos son " + positivos);
		System.out.println("Los numeros Negativos son " + negativos);
		System.out.println("Los numeros Neutros son " + neutros);
		
		
		
		
		

	}

}