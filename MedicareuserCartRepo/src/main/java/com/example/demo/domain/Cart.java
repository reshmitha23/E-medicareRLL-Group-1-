package com.example.demo.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Cart")
public class Cart {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="cId")
	private Integer cId;
	
	//@OneToOne(cascade=CascadeType.ALL)
	//@JoinColumn(name="medicineId",referencedColumnName="cId")
	
	@Column(name="medicineId")
	private Integer medicineId;
	@Column(name="medicineName")
	private String medicineName;
	@Column(name="price")
	private int price;
	
	public Cart() {
		
	}

	public Cart(Integer cId, Integer medicineId, String medicineName, int price) {
		super();
		this.cId = cId;
		this.medicineId = medicineId;
		this.medicineName = medicineName;
		this.price = price;
	}

	public Integer getcId() {
		return cId;
	}

	public void setcId(Integer cId) {
		this.cId = cId;
	}

	public Integer getMedicineId() {
		return medicineId;
	}

	public void setMedicineId(Integer medicineId) {
		this.medicineId = medicineId;
	}

	public String getMedicineName() {
		return medicineName;
	}

	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Cart [cId=" + cId + ", medicineId=" + medicineId + ", medicineName=" + medicineName + ", price=" + price
				+ "]";
	}
	
}

