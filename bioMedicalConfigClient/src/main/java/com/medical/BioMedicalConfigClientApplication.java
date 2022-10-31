package com.medical;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.medical.domain.Medicine;
import com.medical.repository.MedicineRepository;

@EnableHystrixDashboard
@EnableCircuitBreaker
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class BioMedicalConfigClientApplication implements CommandLineRunner{

	@Autowired
	@Qualifier("medicineRepository")
	private MedicineRepository medicineRepository;
	
	@Bean
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(BioMedicalConfigClientApplication.class, args);
		System.out.println("WORKING...");
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("RUNNING....");
		medicineRepository.save(new Medicine(1,"xyz","Paracetamol", "Cipla", 10, 1000));
		medicineRepository.save(new Medicine(2,"abc","Disprin", "XYA", 50, 5000));	
		medicineRepository.save(new Medicine(3,"efg"," Combiflame", "abc", 85, 10000));
		medicineRepository.save(new Medicine(4,"mno","AboMIne", "Cipla", 50, 5000));
				System.out.println(medicineRepository.findAll());
		
	}

}
