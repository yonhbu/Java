package com.co.operadores;

import java.util.Scanner;

public class Practica6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		float compra= 0;
		double descuento= 0;
		
		System.out.println("Ingrese el Total de su Compra");
		compra = sc.nextInt();
		
		descuento = compra - (compra * 0.15);
		
		System.out.println("Su compra total fue de $" + compra + " Menos el 15% de descuento, le queda todo en $" + descuento);
		
		

	}

}
