package com.co.operadores;

import java.util.Scanner;

public class Practica1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		
		int num1, num2 = 0;
		
		System.out.println("Ingrese Numero 1");
        num1 = sc.nextInt();
        
        
        System.out.println("Ingrese Numero 2");
        num2 = sc.nextInt();
        
        
        if (num1 == num2) {
        	int resultado = num1 * num2;
        	System.out.println("son iguales, Multilique " + resultado);
        	
        }else if (num1 > num2) {
        	int resultado = num1 - num2;
        	System.out.println("Num1 es Mayor que Num2, Restelos " + resultado);
        	
        }else if (num1 < num2) {
        	int resultado = num1 + num2;
        	System.out.println("Num1 es Menor que Num2, Sumelos " + resultado);
        }
		
		
	}

		

	}

