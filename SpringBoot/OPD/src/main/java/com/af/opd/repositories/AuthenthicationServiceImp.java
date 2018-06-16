package com.af.opd.repositories;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.af.opd.domain.User;
import com.af.opd.login.security.CustomUserDetails;
import com.af.opd.login.security.JwtAuthenticationResponse;
import com.af.opd.login.security.JwtTokenProvider;
import com.af.opd.model.ApiResponse;
import com.af.opd.model.LoginRequest;
import com.af.opd.model.SignUpRequest;

@Service
public class AuthenthicationServiceImp implements AuthenticationService{
	
	 @Autowired
	    AuthenticationManager authenticationManager;

	    @Autowired
	    UserRepository userRepository;



	    @Autowired
	    PasswordEncoder passwordEncoder;

	    @Autowired
	    JwtTokenProvider tokenProvider;

	@Override
	public ResponseEntity<?> registerUser(SignUpRequest signUpRequest) {
		 if(userRepository.existsByUsername(signUpRequest.getUsername())) {
	            return new ResponseEntity(new ApiResponse(false, "Username is already taken!"),
	                    HttpStatus.BAD_REQUEST);
	        }

	        /*if(userRepository.existsByEmail(signUpRequest.getEmail())) {
	            return new ResponseEntity(new ApiResponse(false, "Email Address already in use!"),
	                    HttpStatus.BAD_REQUEST);
	        }*/

	        // Creating user's account
	        User user = new User( signUpRequest.getUsername(),signUpRequest.getName(), signUpRequest.getPassword(),
	                signUpRequest.getEmail());

	        user.setPassword(passwordEncoder.encode(user.getPassword()));

	        

	        User result = userRepository.save(user);

	        URI location = ServletUriComponentsBuilder
	                .fromCurrentContextPath().path("/users/{username}")
	                .buildAndExpand(result.getUsername()).toUri();

	        return ResponseEntity.created(location).body(new ApiResponse(true, "User registered successfully"));
	    
	}

	@Override
	public ResponseEntity<?> authenticateUser(LoginRequest loginRequest) {
		Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        loginRequest.getUsername(),
                        loginRequest.getPassword()
                )
        );

        SecurityContextHolder.getContext().setAuthentication(authentication);
        CustomUserDetails userDetails= (CustomUserDetails)authentication.getPrincipal();
        	
        String jwt = tokenProvider.generateToken(authentication);
        return ResponseEntity.ok(new JwtAuthenticationResponse(jwt));
	}

}
