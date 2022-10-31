package com.example.fallback;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.domain.User;
import com.example.proxy.UserProxy;

@Component
public class UserFallback implements UserProxy{
	
	

	@Override
	public User findByEmail(String email) {
		return new User(0,"xyz","xyz@gmail.com","123","Bharath","Reddy","male","user");
	}


	@Override
	public List<User> findAll() {
		return Arrays.asList(new User());
	}



}
