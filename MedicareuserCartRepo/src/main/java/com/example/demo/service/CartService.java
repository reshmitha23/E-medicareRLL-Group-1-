package com.example.demo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Cart;
import com.example.demo.repo.UserRepo;

@Service("cartservice")
@Scope("singleton")
public class CartService implements ICartService {

	@Autowired
	@Qualifier("userrepo")
	private UserRepo userrepo;

	@Override
	public Cart addToCart(Cart medicine) {

		 return userrepo.save(medicine);
	}

	@Override
	public Cart updateCart(Cart medicine) {

		return userrepo.save(medicine);
	}

	@Override
	public List<Cart> findAll() {

		return userrepo.findAll();
	}


	@Override
	public void deleteItemById(Integer cId) {

		userrepo.deleteById(cId);

	}

}
