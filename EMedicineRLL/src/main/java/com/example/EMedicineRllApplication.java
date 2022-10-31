package com.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.example.domain.User;
import com.example.repository.UserRepository;


@EnableHystrix
@EnableFeignClients
@EnableCircuitBreaker
@EnableHystrixDashboard
@SpringBootApplication
public class EMedicineRllApplication implements CommandLineRunner{
	
	
	@Autowired
	@Qualifier("userRepository")
	private UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(EMedicineRllApplication.class, args);
	}
	
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
		
	}
	
	
	@Override
	public void run(String... args) throws Exception{
		userRepository.save(new User(0,"xyz","xyz@gmail.com","123","Bharath","Reddy","male","user",1));
		userRepository.save(new User(0,"abc","abc@gmail.com","456","Akhil","Reddy","male","doctor",2));
		userRepository.save(new User(0,"efg","efg@gmail.com","789","Madhu","Reddy","male","admin",3));
		userRepository.save(new User(0,"mno","mno@gmail.com","012","Chinna","Reddy","male","user",4));
		
		
	}
}
	


