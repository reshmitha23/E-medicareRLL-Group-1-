package com.example.domain;





public class Cart {
	
	private Integer cId;
	
	//@OneToOne(cascade=CascadeType.ALL)
	//@JoinColumn(name="medicineId",referencedColumnName="cId")
	
	
	private Integer medicineId;
	
	private String medicineName;

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

