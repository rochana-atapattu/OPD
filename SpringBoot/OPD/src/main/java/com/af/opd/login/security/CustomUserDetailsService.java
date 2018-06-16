package com.af.opd.login.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.af.opd.domain.User;
import com.af.opd.repositories.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService{

	@Autowired
    UserRepository userRepository;
	
	
	@Override
	@Transactional

	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		User user = userRepository.findByUsername(username);
		System.out.println("CustomUserDetailsService "+user.getId()+" " +user.getUsername()+" " +user.getPassword());
		return CustomUserDetails.create(user);
	}
	
	@Transactional

	public UserDetails loadUserById(String id) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		User user = userRepository.findById(id);
                
		return CustomUserDetails.create(user);
	}

}
