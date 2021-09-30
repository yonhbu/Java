package co.com.managment.menu.operaciones;

import java.util.List;

import co.com.managment.model.Product;

public interface Operaciones {
	
	public List<Product> productoSinStock (List<Product> list);
	
	public List<Product> precioMayor ();
	
	public List<Product> nombreyPrecioProductosinStock ();
	
	public Product newProduct ();
	
	public List<Product> getAllProduc ();
			
		
	

}
