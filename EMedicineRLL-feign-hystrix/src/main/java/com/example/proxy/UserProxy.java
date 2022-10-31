package com.example.proxy;

import java.util.List;

import com.example.domain.User;


public interface UserProxy {
	
	User findByEmail(String email);
	List<User> findAll();
}
