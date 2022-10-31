package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.User;
import com.example.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import vo.ResponseTemplateVo;


@RestController
@Scope("request")
@Controller
public class UserController {
	

	@Autowired
	@Qualifier("userService")
	private UserService userService;
	
	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	
	
	@HystrixCommand
	@GetMapping(value="/byEmail/{email}" ,produces = {MediaType.APPLICATION_JSON_VALUE})
	public User findByEmail(@PathVariable String email) {
		return userService.findByEmail(email);
	}
	
	@HystrixCommand
	@PostMapping(value="/saveuser" ,produces = {MediaType.APPLICATION_JSON_VALUE} ,
							consumes = {MediaType.APPLICATION_JSON_VALUE})
	public void saveUser(@RequestBody User user) {
		userService.saveUser(user);
	}
	
	@HystrixCommand
	@GetMapping(value="/users" ,produces={MediaType.APPLICATION_JSON_VALUE})
	public List<User> findAll(){
		return userService.findAll();
	}
	
	@HystrixCommand
	@DeleteMapping(value="/deletebyid/{id}")
	public void deletebyid(@PathVariable int id){
		userService.deletebyid(id);
	}
	
	@GetMapping("/getbyid/{id}")
	public ResponseTemplateVo getById(@PathVariable("id") int id) {
		return userService.getByIdwithMedicine(id);
	}

}
