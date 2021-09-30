package co.com.managment.model;

public class Product {
	
	private int cod;
	private String name;
	private double price;
	private int unit;
	private int stock;
	
	
	public Product () {
		
	}
	
	
	public Product(int cod, String name, double price, int unit, int stock) {
		super();
		this.cod = cod;
		this.name = name;
		this.price = price;
		this.unit = unit;
		this.stock = stock;
	}
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getUnit() {
		return unit;
	}
	public void setUnit(int unit) {
		this.unit = unit;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
	
	

}
