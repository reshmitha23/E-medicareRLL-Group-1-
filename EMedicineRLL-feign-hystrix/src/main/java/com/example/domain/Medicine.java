package com.example.domain;



public class Medicine {

	
	private int medicineId;
	
	private String name;
	private String brand;
	private int quantity;
	private int price;
	public int getMedicineId() {
		return medicineId;
	}
	public void setMedicineId(int medicineId) {
		this.medicineId = medicineId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Medicine [medicineId=" + medicineId + ", name=" + name + ", brand=" + brand + ", quantity=" + quantity
				+ ", price=" + price + "]";
	}
	public Medicine(int medicineId, String name, String brand, int quantity, int price) {
		super();
		this.medicineId = medicineId;
		this.name = name;
		this.brand = brand;
		this.quantity = quantity;
		this.price = price;
	}
	public Medicine() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
