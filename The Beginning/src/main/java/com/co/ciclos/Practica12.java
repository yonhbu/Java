package com.co.ciclos;

import java.util.Scanner;

public class Practica12 {

	public static void main(String[] args) {
		
		double cal = 0;
		double promedio = 0;
		double cal_baja = 9999;
		double suma = 0;
		
		Scanner sc = new Scanner (System.in);
		
		for (int i = 1; i <=5; i++) {
			
			System.out.println("Ingrese Calificacion " + i);
			cal = sc.nextInt();
            suma = suma + cal ;
          
			
			if (cal < cal_baja ) {
				
				cal_baja = cal;
			}
			
		}
		
		promedio = suma / 5;
		
		System.out.println("La calificacion Promedio es " + promedio);
		System.out.println("La Nota mas Baja es " + cal_baja);

	}

}
