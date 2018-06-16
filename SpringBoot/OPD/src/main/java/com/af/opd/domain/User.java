package com.af.opd.domain;

import java.util.UUID;

import org.springframework.data.annotation.Id;

public class User {

	@Id
	private String id;
	private String username;
	private String name;
	private String specialization;
	private String password;
	private int phone;
	private String email;
	
	public User(String username, String name, String password, String email) {
		super();
		String temp=UUID.randomUUID().toString();
		this.id=temp;
		this.username = username;
		this.name = name;
		this.password = password;
		//this.phone = phone;
		this.email = email;
		
		System.out.println(this.id+" "+ username+" ");
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	
	
	
}
