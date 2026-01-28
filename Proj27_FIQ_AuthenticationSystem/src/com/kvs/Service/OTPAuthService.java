package com.kvs.Service;

import org.springframework.stereotype.Component;

@Component("otp")
public class OTPAuthService implements AuthService{

	@Override
	public void authenticate() {
		 System.out.println("Login with OTPAuthService...!");
		
	}

}
