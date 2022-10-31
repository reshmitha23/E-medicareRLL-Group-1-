package com.example.demo.repo;


import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Cart;
@Repository("userrepo")
@Scope("singleton")
public interface UserRepo extends JpaRepository<Cart, Integer> {

	

}
