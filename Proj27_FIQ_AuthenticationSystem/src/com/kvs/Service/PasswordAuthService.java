package com.kvs.Service;

import org.springframework.stereotype.Component;

@Component("pass")
public class PasswordAuthService implements AuthService {

	@Override
	public void authenticate() {
		System.out.println("Login with PasswordAuthService.........!");
		
	}

}
