package com.example.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	
	@Column(name = "userId")
	private String userId;


	@Column(name = "username")
	private String email;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "role")
	private String role;
	
	@Column(name = "rtid")
	private int rtid;
	
	
	public User() {
		
	}



	public User(int id, String userId, String email, String password, String firstName, String lastName, String gender, String role, int rtid) {
		super();
		this.id = id;
		this.userId = userId;
		this.email = email;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.role = role;
		this.rtid = rtid;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	
	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}

	
	
	public int getRtid() {
		return rtid;
	}



	public void setRtid(int rtid) {
		this.rtid = rtid;
	}



	@Override
	public String toString() {
		return "User [id=" + id + ", userId=" + userId + ", email=" + email + ", password=" + password + ", firstName="
				+ firstName + ", lastName=" + lastName + ", gender=" + gender + ", role=" + role + ", rtid=" + rtid
				+ "]";
	}


	
	

}
