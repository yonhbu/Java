package com.co.ciclos;

import java.util.Scanner;

public class Practica17 {

	public static void main(String[] args) {
		
		
		//Calcular salarios y sumatoria
		
		Scanner sc = new Scanner (System.in);	
		int TarifaP = 0;
		int iterador = 1;
		int salario = 0;
		int suma = 0;
		int HorasT = 0;

		
		
		
		while (iterador <= 2) {
			
			System.out.println("Ingrese las Horas trabajadas para el trabajador " + iterador);
			HorasT = sc.nextInt();
			
			System.out.println("Ingrese La tarifa del pago?");
			TarifaP = sc.nextInt();			
			
			salario = HorasT * TarifaP;
			
			System.out.println("El salario del trabajador " + iterador + " Es " + salario);
			suma = suma + salario;
			iterador = iterador + 1;
			
			
		}
		

		System.out.println("La suma total de los salario es de  " + suma);
		

	}

}
