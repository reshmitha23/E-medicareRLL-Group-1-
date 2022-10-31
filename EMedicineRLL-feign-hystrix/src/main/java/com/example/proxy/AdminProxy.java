package com.example.proxy;


import java.util.List;

import com.example.domain.Admin;




public interface AdminProxy {

	Admin findByEmail(String user);
	List<Admin> findAll();
}