package co.com.managment.menu.submenu;

import java.util.List;
import java.util.Scanner;
import co.com.managment.menu.operaciones.Operaciones;
import co.com.managment.menu.operaciones.ProductFactory;
import co.com.managment.model.Product;

public class IngresoProductos {
	 
	Scanner sc = new Scanner (System.in);
	Operaciones producto = ProductFactory.getOperaciones();
	String salir = "";

	
	public boolean ingresoProductos () {
		boolean fin = true;
		
		do {
	    System.out.println("Ingrese Codigo del Producto");
	    producto.newProduct().setCod(sc.nextInt());
	    System.out.println("Ingrese Nombre del Producto");
	    producto.newProduct().setName(sc.next());
	    System.out.println("Digite Precio del Producto");
	    producto.newProduct().setPrice(sc.nextDouble());
	    System.out.println("Ingrese las Unidades almacenar del producto");
	    producto.newProduct().setUnit(sc.nextInt());
	    System.out.println("Ingrese Stock");
	    producto.newProduct().setStock(sc.nextInt());
	    System.out.println("Desea Continuar Agregando Productos? Y/N");
	    salir = sc.next();
	    
	    if (salir.equalsIgnoreCase("y")){
	    	return true;
	    	
	    } else {
	    	
	    	return false;
	    }
	    		
	    
		}while(fin);
	    
	}
	
	
	
	public List<Product> getAllProduc () {
	  return producto.getAllProduc();
		
	}
	

	}
	

