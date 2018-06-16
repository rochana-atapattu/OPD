package com.af.opd.repositories;

import org.springframework.http.ResponseEntity;

import com.af.opd.model.LoginRequest;
import com.af.opd.model.SignUpRequest;


public interface AuthenticationService {

	public ResponseEntity<?> registerUser(SignUpRequest signUpRequest); 
	public ResponseEntity<?> authenticateUser(LoginRequest loginRequest);
}
