package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Cart;
import com.example.proxy.CartProxy;

@RestController
@Scope("request")
@RequestMapping("/cart")
public class CartController {

	@Autowired
	private CartProxy cartProxy;
	

	@GetMapping(value= "/getCart")
	public List<Cart> getAllItems() {
	
		return cartProxy.findAll();
	}
	
	

}
