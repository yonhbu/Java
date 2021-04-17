package com.co.operadores;

import java.util.Scanner;

public class Practica3 {
	
	public static void main (String args[]) {
		
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Calcular numero de segundos que va ingresar en la hora");
		int hora = sc.nextInt();
		
		
		System.out.println("Calcular numero de segundos que va ingresar en determinados minutos");
		int minutos = sc.nextInt();
		
		int resultadoHora = 3600 * hora;
		int resultadoMinutos = 60 * minutos;
		
		
	   System.out.println(hora + " Hora Tiene " + resultadoHora + " Segundos");
	   System.out.println(minutos + " Minuto Tiene " + resultadoMinutos + " Segundos");
		
	}
		
		
}