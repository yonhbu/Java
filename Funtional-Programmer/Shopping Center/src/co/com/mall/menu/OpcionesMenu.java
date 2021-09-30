package co.com.mall.menu;

import java.util.Scanner;

import co.com.mall.factory.FactoryOperation;
import co.com.mall.operaciones.OperacionesNumPosivosImp;
import co.com.mall.port.IOperaciones;

public class OpcionesMenu {
	
	//1. Principio de Responsabilidad Unica

	Scanner sc = new Scanner(System.in);
	String newline = System.getProperty("line.separator");
	
	IOperaciones opc = FactoryOperation.getOperation();
	//OperacionesNumPosivosImp opc = new OperacionesNumPosivosImp ();
		
	
	public String init () {
		int numIngresado = 0;
		int mayorNumIngresado = 0;
		int menorNumIngresado = 0;
		int sumaDeTodoslosNumeros = 0;

		while (numIngresado != -1) {

			System.out.println("Ingrese Numero");
			numIngresado = sc.nextInt();
			
			if (numIngresado != -1) { 
			mayorNumIngresado = opc.mayorNumIntroducido(numIngresado);
			menorNumIngresado = opc.menorNumIntroducido(numIngresado);
			menorNumIngresado = opc.menorNumIntroducido(numIngresado);
			sumaDeTodoslosNumeros = opc.sumaNumeros(numIngresado);
			
			}
		}
		

		return "Resultados de la Operacion " + newline +
				"El numero Mayor ingresado fue " + mayorNumIngresado
		        + newline + "El numero Menor ingresado fue " + menorNumIngresado
		        + newline + "La suma de Todos los Numeros es: " + sumaDeTodoslosNumeros;
	}
	
	


}
