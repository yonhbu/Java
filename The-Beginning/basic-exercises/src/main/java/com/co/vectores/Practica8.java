package com.co.vectores;

import java.util.Scanner;

public class Practica8 {
	
	// Insertar un numero en un arreglo ordenado

	
	public static void main(String[] args) {
		
		

		Scanner sc = new Scanner (System.in);
		int []  vector = new int [6];
		boolean creciente  = true; 
		int num = 0, posicionNum = 0, j = 0;


		//-------------------------
		System.out.println("ingrese un arreglo ordenado ");
		
		do {
			
	
		for (int i = 0; i < 5; i++) {
			
			System.out.println("Digite un numero");
			vector [i] = sc.nextInt();
				
		}
		
		System.out.println("Comprobar si el arreglo esta ordenado");
		
		for (int i = 0; i < 4; i++) {
		
			if (vector[i] < vector [i+1]) { //Arreglo en forma creciente 1 2 3 4 5
				creciente = true;
				
			}
			
			if (vector[i] > vector [i+1])  { //Arreglo en forma Decreciente 1 2 3 4 5
				creciente = false;
			    break;
		}
			
		}
		
		   if (creciente == false) {
			System.out.println("El arreglo no esta ordenado, digite nuevamente");
	      	}
		   
		   if (creciente == true) {
				System.out.println("El arreglo esta muy ordenado; FIN");
		      	}
		   
		   
	} while (creciente == false);
		
		System.out.println("Digite un Numero agregar");
		num = sc.nextInt();

		
		//Este ciclo nos damos cuenta en que posicion iria el numero
		
		while (vector[j] < num && j < 4) {
			
			posicionNum++; // este dato es para conocer la posicion, el numero en el array donde debemos insertar el dato
			j++;
			
		}
		
		for (int i = 4; i >=posicionNum; i--) { // de esta forma, recorremos el arreglo detras hacia adelante  para desplazar la posicion de arreglo
			
			vector[i + 1] = vector[i];
			
		}
		
		vector[posicionNum] = num;
		
		
		//Asi queda el arreglo
		
		for (int i = 0; i < vector.length; i++) {
			
			System.out.println(vector[i]);
			
		}
		
		
	}
	
	

}
