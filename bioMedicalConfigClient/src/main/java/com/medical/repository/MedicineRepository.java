package com.medical.repository;

import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medical.domain.Medicine;

@Repository("medicineRepository")

@Scope("singleton")
public interface MedicineRepository extends JpaRepository<Medicine, Integer>{

}
