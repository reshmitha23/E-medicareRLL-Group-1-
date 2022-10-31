package com.example.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Admin;
import com.example.proxy.AdminProxy;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@Scope("request")
@RequestMapping("/admin")
public class AdminController {
	
    @Autowired
	private AdminProxy adminProxy;
    
    
    @HystrixCommand
	@GetMapping(value="/findall")
	public List<Admin> findAll(){
		return adminProxy.findAll();
	}

}