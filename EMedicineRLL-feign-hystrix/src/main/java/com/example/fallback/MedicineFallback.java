package com.example.fallback;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.domain.Medicine;
import com.example.proxy.MedicineProxy;

@Component
public class MedicineFallback implements MedicineProxy{

	@Override
	public List<Medicine> getAllMedicines() {
		// TODO Auto-generated method stub
		return Arrays.asList(new Medicine());
	}


	@Override
	public Medicine findBymedicineId(@PathVariable("id") int id) {
	return new Medicine(00,"Paracetamol", "Cipla", 10, 1000);
	}


	
}
