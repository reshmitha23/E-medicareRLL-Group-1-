package com.medical.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Medicine {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "rtid")
	private int rtid;
	
	
	private String name;
	private String brand;
	private int quantity;
	private int price;
	
	public int getRtId() {
		return rtid;
	}
	public void setRtId(int medicineId) {
		this.rtid = medicineId;
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
		return "Medicine [Id=" + rtid + ", name=" + name + ", brand=" + brand
				+ ", quantity=" + quantity + ", price=" + price + "]";
	}
	public Medicine(int rtid, String userId, String name, String brand, int quantity, int price) {
		super();
		this.rtid = rtid;
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
