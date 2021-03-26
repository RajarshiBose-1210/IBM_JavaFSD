package com.ibm.shooping;

public class Product {

	private int price;
	private String name;
	private static int stock;
	
	public static int getStock() {
		return stock;
	}
	public static void setStock(int stock) {
		Product.stock = stock;
	}
	public Product(int price, String name, int stock) {
		super();
		this.price = price;
		this.name = name;
		this.stock=stock;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
