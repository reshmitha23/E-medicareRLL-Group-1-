package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.domain.User;
import com.example.repository.UserRepository;

import vo.Medicine;
import vo.ResponseTemplateVo;

@Service("userService")
public class UserService implements iUserService{
	
	@Autowired
	@Qualifier("userRepository")
	private UserRepository userRepository;
	
	@Autowired
	private RestTemplate restTemplate;
	

	@Override
	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}

	@Override
	public void saveUser(User user) {
		userRepository.save(user);
		
	}

	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}

	@Override
	public void deletebyid(int id) {
		userRepository.deleteById(id);
		
	}


	public ResponseTemplateVo getByIdwithMedicine(int id) {
		
		  ResponseTemplateVo vo= new ResponseTemplateVo();
		  
		  User user = userRepository.findById(id).get();
		  
		        
		Medicine medicine=restTemplate.getForObject("http://MEDICINE/medicine/get-medicines/"+user.getRtid(),Medicine.class);
		        
		      vo.setUser(user);
		      vo.setMedicine(medicine);	  
		return vo;
	}

}
