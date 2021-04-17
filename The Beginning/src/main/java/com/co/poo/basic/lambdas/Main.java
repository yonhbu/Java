package com.co.poo.basic.lambdas;

import com.co.poo.basic.libros.Libro;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ICalculadoraFortuna iCalculadoraFortuna = new PersonaSuerte();

		int suerte1 = iCalculadoraFortuna.calcularSuerte("Juan");
		int suerte2 = iCalculadoraFortuna.calcularSuerte("Antonio");
		int suerte3 = iCalculadoraFortuna.calcularSuerte("Vargas");
		int suerte4 = iCalculadoraFortuna.calcularSuerte("Bustos");

		System.out.println("Tu numero de Suerte Sera " + suerte1);
		System.out.println("Tu numero de Suerte Sera " + suerte2);
		System.out.println("Tu numero de Suerte Sera " + suerte3);
		System.out.println("Tu numero de Suerte Sera " + suerte4);


		System.out.println("***********************Lambdas********");

		ICalculadoraFortuna iCalculadoraFortunaLamda = nombre -> nombre.length();
				int fortuna = iCalculadoraFortunaLamda.calcularSuerte("juan");
				System.out.println(fortuna);









	}

}
