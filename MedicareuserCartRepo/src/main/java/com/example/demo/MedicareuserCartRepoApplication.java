package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

import com.example.demo.domain.Cart;
import com.example.demo.repo.UserRepo;
@EnableHystrixDashboard
@SpringBootApplication
public class MedicareuserCartRepoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(MedicareuserCartRepoApplication.class, args);
	}
	@Autowired
	@Qualifier("userrepo")
	private UserRepo userrepo;
	@Override
	public void run(String... args) throws Exception {
		userrepo.save(new Cart(0,1,"paracetomal",100));
		userrepo.save(new Cart(0,2,"cipla",100));
		userrepo.save(new Cart(0,3,"dolo650",100));
		
	}
}
