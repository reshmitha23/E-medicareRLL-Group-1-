package com.example.fallback;



import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.domain.Admin;
import com.example.proxy.AdminProxy;


@Component
public class AdminFallback implements AdminProxy{

	
	@Override
	public List<Admin> findAll() {
		return Arrays.asList(new Admin());
	}
	
	@Override
	public Admin findByEmail(@PathVariable String emailId) {
		return new Admin(0,"xyz@gmail.com","xyz","123");
	}
	
	
	
}