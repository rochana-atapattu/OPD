package com.af.opd.login.security;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import com.af.opd.domain.User;

public class CustomUserDetails implements UserDetails{

	private String username;
	private String password;
	private String id;
	
	
	public String getId() {
		return id;
	}

	public CustomUserDetails(String id, String username, String password) {
		super();
		this.id=id;
		this.username = username;
		this.password = password;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static CustomUserDetails create(User user) {
        
		System.out.println("CustomUserDetails "+user.getId()+" " +user.getUsername()+" " +user.getPassword());
        return new CustomUserDetails(user.getId(),user.getUsername(),user.getPassword());
    }

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return username;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
	

}
