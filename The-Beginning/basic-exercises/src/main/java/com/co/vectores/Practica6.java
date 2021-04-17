package com.co.vectores;

import java.util.Scanner;

public class Practica6 {

	public static void main(String[] args) {
		
		//  Determinar el orden de un arreglo
		
		int []  vector = new int [5];
		
		Scanner sc = new Scanner (System.in);
		boolean a = false;
		boolean b = false;
		
		for (int i = 0; i < vector.length; i++) {

			System.out.println(" Ingrese valor " + ( i + 1) + " " );
			vector[i] = sc.nextInt();
			
			
		}
		
		
		for (int x = 0; x < vector.length - 1; x++) {

			if (vector[x] < vector[x + 1]) {
				a = true;
			}else if (vector[x] > vector[x + 1]) {
				b = true;
			
			
		}
			
		}
			if (a == true && b == false) {
				System.out.println("Numeros en Forma Ascendente");
			}else if (a == false && b == true) {
				System.out.println("Numeros en Forma Descendente");
			}else if (a && b) {
				System.out.println("Numeros en Forma Desordenada");
			}
		
		
		}

	}


