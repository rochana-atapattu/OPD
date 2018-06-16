package com.af.opd.controller;



import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.af.opd.model.LoginRequest;
import com.af.opd.model.SignUpRequest;
import com.af.opd.repositories.AuthenticationService;


@RestController
@RequestMapping("/authentication")
public class AuthenticationController {

	@Autowired
	AuthenticationService authenticationService;
   

    @PostMapping("/login")
    public ResponseEntity<?> authenticate(@Valid @RequestBody LoginRequest loginRequest) {
    	
    	return authenticationService.authenticateUser(loginRequest);
        
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@Valid @RequestBody SignUpRequest signUpRequest) {
       return authenticationService.registerUser(signUpRequest);
    }
}