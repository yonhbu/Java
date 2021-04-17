package com.co.operadores;

import java.util.Scanner;

public class Practica7 {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		double cal1,cal2,cal3,promedioCal, examenFinal, trabajoFinal, calFinal = 0;
		double porcentaje, porcentaje2, porcentaje3;
		
		
		System.out.println("Ingrese Calificacion Notas 1");
        cal1 = sc.nextInt();
        
        System.out.println("Ingrese Calificacion Notas 2");
        cal2 = sc.nextInt();
        
        System.out.println("Ingrese Calificacion Notas 3");
        cal3 = sc.nextInt();
        
        
        System.out.println("Ingrese Calificacion de su Examen Final");
        examenFinal = sc.nextInt();
        
        System.out.println("Ingrese Calificacion de su Trabajo Final");
        trabajoFinal = sc.nextInt();
        
        promedioCal = (cal1 + cal2 + cal3) / 3;
        
        porcentaje = promedioCal * 0.55;
        porcentaje2 = examenFinal * 0.30;
        porcentaje3 = trabajoFinal * 0.15;
        
        calFinal = porcentaje + porcentaje2 + porcentaje3;           
        
        
        System.out.println("Su Calificacion Final es " + calFinal);
        
        
}
        
        
}
