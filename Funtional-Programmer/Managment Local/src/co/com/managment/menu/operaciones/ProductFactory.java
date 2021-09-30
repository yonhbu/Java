package co.com.managment.menu.operaciones;



public class ProductFactory {
	
	public static Operaciones getOperaciones () {
		return new OperacionesProductos();
	}

}
