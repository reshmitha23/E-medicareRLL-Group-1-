package com.example.controller;

import java.util.List;

//import javax.inject.Qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Medicine;
import com.example.fallback.MedicineFallback;


@RestController
@Scope("request")
@RequestMapping("/")
public class MedicineController {

	@Autowired
	private MedicineFallback medicineProxy;
	
	@GetMapping(value="/get-medicines")
	public List<Medicine> getAll(){
		return medicineProxy.getAllMedicines();
	}

	
}
