package com.sbmaster.todoapp.login.controller;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	public boolean authenticate(String username, String password) {
		
		return username.equalsIgnoreCase("Bob") && password.equalsIgnoreCase("1234");
	}

}
