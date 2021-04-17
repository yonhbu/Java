package com.co.operadores;

import java.util.Scanner;

public class Practica5 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int ExamenA, ExamenB, ExamenC, TotalminA, TotalminB,TotalminC, SumadeMin, TotalHoras;
		
		System.out.println("Ingrese Cuantos examenes el profesor va a revisar para la Clase A?");
		ExamenA =  sc.nextInt();
		

		System.out.println("Ingrese Cuantos examenes el profesor va a revisar para la Clase B?");
		ExamenB =  sc.nextInt();		
		

		System.out.println("Ingrese Cuantos examenes el profesor va a revisar para la Clase C?");
		ExamenC =  sc.nextInt();
		
		
		TotalminA = ExamenA * 5;
		TotalminB = ExamenB * 8;
		TotalminC = ExamenC * 6;
		
		SumadeMin = TotalminA + TotalminB + TotalminC;
		TotalHoras = SumadeMin / 60;
		
		System.out.println("El profesor tardara " + SumadeMin + " Minutos " + "en revisar todos los examanes de los Salones (A, B, C) y " + TotalHoras + " Horas, En Revisar todos del A, B Y C" );
		
		
		
		
	}

}
