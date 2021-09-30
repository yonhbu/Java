package co.com.managment.menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import co.com.managment.menu.submenu.IngresoProductos;
import co.com.managment.model.Product;

public class Menu {
	
	Scanner sc = new Scanner (System.in);
	IngresoProductos ingresoProducto = new IngresoProductos();
	List<Product> resultProducSinStock = new ArrayList<Product>();
	//List<Product> resultProducMayoraCincoMil = new ArrayList<Product>();
	int opc = 0;
	boolean dato;

	public void getMenu() {
		
		do {
	    System.out.println("Welcome to Managment Local");
	    System.out.println("Seleccione una de las siguientes Opciones");
	    System.out.println("1. Ingreso de Productos");
	    System.out.println("2. Nombre de productos sin Stock");
	    System.out.println("3. Precio de Productos Mayores a 10.000 Pesos");
	    System.out.println("4. Visualizar Nombre y precio de los de Productos sin Stock");
	    opc = sc.nextInt();
	    dato = opcionMenu(opc);
	    
	    //resultProducSinStock.forEach(valores -> System.out.println(valores.getName()));
	    //resultProducSinStock.forEach(valores -> System.out.println(valores.getUnit()));
	    
	    resultProducSinStock.stream()
	    .filter(listaDatos ->  listaDatos.getStock() <= 1)
	    .forEach(listaDatos -> System.out.println("Nombre de productos sin Stock: "
	     + listaDatos.getName()));
	    
//	    resultProducMayoraCincoMil.stream()
//	    .filter(listaDatosMayor5000 ->  listaDatosMayor5000.getPrice() >= 5000)
//	    .forEach(listaDatosMayor5000 -> System.out.println("Nombre de Precio de Productos Mayores a 5.000 Pesos: "
//	     + listaDatosMayor5000.getName()));
	    
	    
		}while (dato == false);
		}

	
	
	public boolean opcionMenu (int opc) {
		
		boolean result = true;

		if (opc == 1) {
			
			do {
				
				result = ingresoProducto.ingresoProductos();
			
			}while(result);
	
		} else {
			
			obtenerOperaciones();
		}
		return result;

	}
	
	
	public List<Product> obtenerOperaciones () {
		
		if (opc == 2) {
			
			resultProducSinStock = ingresoProducto.getAllProduc();
			
			return resultProducSinStock;
			
	
		} else if (opc == 3) {
			
			//resultProducMayoraCincoMil = ingresoProducto.getAllProduc();
			
			//return resultProducMayoraCincoMil;
			
		}else if (opc == 4) {
			
		
			
		} else if (opc == 5) {
			
			//ingresoProducto.ingresoProductos();
			
		}
		
		return null;
		
	}
	
	
	}

