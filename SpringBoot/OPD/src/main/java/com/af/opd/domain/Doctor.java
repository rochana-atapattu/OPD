package com.af.opd.domain;

import java.util.UUID;

import org.springframework.data.annotation.Id;

public class Doctor {
	
	@Id
	private String doctorId;
	private String firstName;
	private String lastName;
	private String specialization;
	private String email;
	private String password;
	
	
	
	public Doctor() {
		super();
	}

	public Doctor(String firstName, String lastName, String specialization, String email,
			String password) {
		super();
		this.doctorId = UUID.randomUUID().toString();
		this.firstName = firstName;
		this.lastName = lastName;
		this.specialization = specialization;
		this.email = email;
		this.password = password;
	}

	public String getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
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

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
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
	
	
	
}
