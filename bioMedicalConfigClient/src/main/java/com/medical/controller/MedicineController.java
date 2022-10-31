package com.medical.controller;

import java.util.List;

//import javax.inject.Qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.medical.domain.Medicine;
import com.medical.service.MedicineService;

@RestController
@Scope("request")
public class MedicineController {

	@Autowired
	@Qualifier("medicineService")
	private MedicineService medicineService;
	
	
	@GetMapping(value="/medicine/get-medicines", produces={MediaType.APPLICATION_JSON_VALUE})
	@ResponseStatus(code=HttpStatus.OK)
	public List<Medicine> getAll(){
		return medicineService.getAllMedicines();
	}
	
	
   @PutMapping(value="/medicine/update",produces = {MediaType.APPLICATION_JSON_VALUE},consumes = {MediaType.APPLICATION_JSON_VALUE})
   @ResponseStatus(code=HttpStatus.ACCEPTED)
	public Medicine update(@RequestBody Medicine medicine) {
		return medicineService.updateMedicine(medicine);
	}
   @PostMapping(value = "/medicine/add",produces = {MediaType.APPLICATION_JSON_VALUE},consumes = {MediaType.APPLICATION_JSON_VALUE})
   @ResponseStatus(code=HttpStatus.CREATED)
	public Medicine add(@RequestBody Medicine medicine) {
		return medicineService.addMedicine(medicine);
	}
   @DeleteMapping(value="/medicine/delete/{id}")
   @ResponseStatus(code=HttpStatus.NOT_FOUND)
	public void  delete(@PathVariable int id) {
	medicineService.deleteMedicine(id);
	}

	
}
