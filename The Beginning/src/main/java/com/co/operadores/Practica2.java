package com.co.operadores;


public class Practica2 {

	public static void main (String args[] ) {
		
		int num1 = 100;
		int num2 = 90;
		int num3 = 80;
		int num4 = 70;
		int num5 = 60;
		int num6 = 90;
		int num7 = 90;
		int num8 = 90;
		int num9 = 40;
		int num10 = 40;
		
		
		double promedio = (num1 + num2 + num3 +num4 + num5 + num6 + num7 + num8 + num9 + num10) / 10;
		
		
		String mensaje  = (promedio <= 60 ? "Necesita Poner mas Atencion al Curso " + promedio : " Felicitaciones " + promedio); 
		
		System.out.println(mensaje);
		
		
		
		
		
		
	}
	
	
}
