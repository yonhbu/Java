package com.co.ciclos;

import java.util.Scanner;

public class Practica15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);	
		int numero = 0;
		int numero2 = 0;
		int iterador = 1;
		int sumaPares = 0;
		int contadorPar = 0;
		int contadorImPar = 0;
		int impar = 0;
		double promedio = 1;
		
		System.out.println("Ingrese la cantidad de numeros a Iterar?");
		numero = sc.nextInt();
		
		while (iterador <= numero) {
	    System.out.println("Ahora por favor ingrese el numero ?");
	    numero2 = sc.nextInt();
	    
	    if (numero2 %2 == 0) {
	    	sumaPares = sumaPares + numero ;
	    	contadorPar = contadorPar + 1;
	    	
	    }else {
	    	impar = impar + numero;
	    	contadorImPar = contadorImPar + 1;
	    }
	    promedio = impar / contadorImPar;
	    iterador = iterador  + 1;
		}

		System.out.println("La suma de los numeros pares es = " + sumaPares);
		System.out.println("Se ingresaron " + contadorPar + " Pares");
		System.out.println("El promedio de los numeros impares es " + promedio);
	}

}
