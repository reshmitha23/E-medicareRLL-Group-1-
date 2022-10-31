package com.medical.service;

import java.util.List;

//import javax.inject.Qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.medical.domain.Medicine;
import com.medical.repository.MedicineRepository;

@Service("medicineService")
@Scope("singleton")

public class MedicineService implements IMedicine{

	@Autowired
	@Qualifier("medicineRepository")
	
	private MedicineRepository medicineRepository;
	@Override
	public List<Medicine> getAllMedicines() {
		// TODO Auto-generated method stub
		return medicineRepository.findAll();
	}

	@Override
	public Medicine updateMedicine(Medicine medicine) {
		// TODO Auto-generated method stub
		return medicineRepository.save(medicine);
	}

	@Override
	public Medicine addMedicine(Medicine medicine) {
		// TODO Auto-generated method stub
		return medicineRepository.save(medicine);
	}

	@Override
	public Medicine findBymedicineId(int id) {
		// TODO Auto-generated method stub
	return medicineRepository.findById(id).get();
	}

	@Override
	public void deleteMedicine(int id) {
		// TODO Auto-generated method stub
		medicineRepository.deleteById(id);
	}

	
}
