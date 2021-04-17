package com.co.operadores;

import java.util.Scanner;

public class Practica4 {
	
	public static void main(String args[]) {
		
		double numH, numM, totalEstudiantes, porcentajeHombres, porcentajeMujeres;
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Ingrese numero de Hombres");
		numH = sc.nextInt();		
		

		System.out.println("Ingrese numero de Mujeres");
		numM = sc.nextInt();
		
		totalEstudiantes = numH + numM;
		
		porcentajeHombres = (numH / totalEstudiantes) * 100;
		porcentajeMujeres = numM / totalEstudiantes * 100;
		
		System.out.println("El porcentaje de hombres es de " + porcentajeHombres +  "%");
		System.out.println("El porcentaje de Mujeres es de " + porcentajeMujeres + "%");
		
		
	}
	

}
