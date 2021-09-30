package co.com.mall.operaciones;

import co.com.mall.port.IOperaciones;

public class OperacionesNumNegativosImp implements IOperaciones {
	
	int numMayor = 0;
	int numMeAnterior = 1000000000;
	int suma = 0;
	int sumPos = 0;
	

	public int sumaNumeros(int numIngresado) {
		
		suma = suma + numIngresado;
		return suma;
	}


	public int menorNumIntroducido(int num) {
		 
			if (num < numMeAnterior) {	
				
				numMeAnterior = num;			
			}	
		
		return numMeAnterior;
	}


	public int mayorNumIntroducido (int num) {
		
		 
			if (num > numMayor) {	
				numMayor = num;			
			}
		
		
		return numMayor;
	}



}
