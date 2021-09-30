package co.com.managment.menu.operaciones;

import java.util.ArrayList;
import java.util.List;

import co.com.managment.model.Product;

public class OperacionesProductos implements Operaciones {
	List<Product> listProduc = new ArrayList<Product>();
	
	public OperacionesProductos() {
	}

	@Override
	public List<Product> productoSinStock(List<Product> list) {
		return null;
	}

	@Override
	public List<Product> precioMayor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> nombreyPrecioProductosinStock() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product newProduct() {
		Product producto = new Product();
		listProduc.add(producto);
		return producto;
	}

	@Override
	public List<Product> getAllProduc() {
		return listProduc;
	}
	
	
	
	
	
	

}
