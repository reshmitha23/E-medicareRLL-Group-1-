package com.example.service;

import java.util.List;

import com.example.domain.User;

import vo.ResponseTemplateVo;


public interface iUserService {
	
	User findByEmail(String email);
	void saveUser(User user);
	List<User> findAll();
	void deletebyid(int id);
	ResponseTemplateVo getByIdwithMedicine(int userId);
}
