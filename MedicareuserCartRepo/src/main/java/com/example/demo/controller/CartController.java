package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Cart;
import com.example.demo.service.ICartService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@Scope("request")
@RequestMapping("/cart")
@Controller

public class CartController {

	@Autowired
	@Qualifier("cartservice")
	private ICartService cartservice;
	
	@HystrixCommand
	@GetMapping(value = "/", produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseStatus(code = HttpStatus.OK)
	public String dummymethod() {
		return "working";
	}
	@HystrixCommand
	@PostMapping(value="/addToCart", produces= {MediaType.APPLICATION_JSON_VALUE},consumes = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseStatus(code = HttpStatus.CREATED)
	public Cart addToCart(@RequestBody Cart medicine) {
		return cartservice.addToCart(medicine);

	}
	@HystrixCommand
	@PutMapping(value="/updateCart", produces= {MediaType.APPLICATION_JSON_VALUE},consumes = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseStatus(code = HttpStatus.ACCEPTED)
	public Cart updateCart(@RequestBody Cart medicine) {
		return cartservice.updateCart(medicine);

	}
	@HystrixCommand
	@GetMapping(value= "/getCart", produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseStatus(code = HttpStatus.OK)
	public List<Cart> getAllItems() {
		System.out.println("hiee");
		System.out.println(cartservice);
		return cartservice.findAll();
	}
	@HystrixCommand
	@DeleteMapping(value="/delete{cId}", produces= {MediaType.APPLICATION_JSON_VALUE})
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void deleteItemById(@PathVariable("cId") Integer cId) {

		cartservice.deleteItemById(cId);

	}

}
