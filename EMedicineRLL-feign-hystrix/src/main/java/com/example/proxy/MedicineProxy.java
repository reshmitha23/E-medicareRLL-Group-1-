package com.example.proxy;

import java.util.List;

import com.example.domain.Medicine;




public interface MedicineProxy {

	List<Medicine> getAllMedicines();
	public Medicine findBymedicineId(int id);
	
}
