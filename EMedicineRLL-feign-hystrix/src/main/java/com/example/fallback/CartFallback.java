package com.example.fallback;



import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;


import com.example.domain.Cart;
import com.example.proxy.CartProxy;

@Component
public class CartFallback implements CartProxy {


	@Override
	public List<Cart> findAll() {
		return Arrays.asList(new Cart());
	}



}
