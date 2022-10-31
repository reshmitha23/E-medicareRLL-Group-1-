package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableCircuitBreaker
@EnableFeignClients
@EnableHystrixDashboard
@SpringBootApplication
public class EMedicineRLLFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(EMedicineRLLFeignApplication.class, args);
	}

}
