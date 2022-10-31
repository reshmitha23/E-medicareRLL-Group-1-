package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.User;
import com.example.proxy.UserProxy;


@RestController
@Scope("request")
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserProxy userProxy;
	
	@GetMapping(value="/byEmail/{email}")
	public User findByEmail(@PathVariable String email) {
		return userProxy.findByEmail(email);
	}
	
	@GetMapping(value="/users")
	public List<User> findAll() {
		return userProxy.findAll();
	}
	
}
