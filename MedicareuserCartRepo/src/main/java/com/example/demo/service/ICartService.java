package com.example.demo.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.domain.Cart;

public interface ICartService {
	public Cart addToCart(Cart medicine);
	public Cart updateCart(Cart medicine);
	public List<Cart> findAll();
	public void deleteItemById(@PathVariable("cId") Integer cId);
}
