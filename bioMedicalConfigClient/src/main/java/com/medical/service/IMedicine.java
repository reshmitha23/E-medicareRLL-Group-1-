package com.medical.service;

import java.util.List;

import com.medical.domain.Medicine;


public interface IMedicine {

	List<Medicine> getAllMedicines();
	public Medicine updateMedicine(Medicine medicine);
	public Medicine addMedicine(Medicine medicine);
	public Medicine findBymedicineId(int id);
	public void deleteMedicine(int id);
	
}
