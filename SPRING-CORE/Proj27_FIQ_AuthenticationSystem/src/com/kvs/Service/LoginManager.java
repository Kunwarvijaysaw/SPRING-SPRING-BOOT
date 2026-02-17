package com.kvs.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class LoginManager {
	AuthService authService;

	
	@Autowired
	@Qualifier("otp")
	public void setAuthService(AuthService authService) {
		this.authService = authService;
	}
	
	public void verifyLogin() {
		authService.authenticate();
	}
	
	

}
