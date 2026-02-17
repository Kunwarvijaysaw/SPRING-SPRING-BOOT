package com.kvs.authentication;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kvs.Service.LoginManager;
import com.kvs.config.AppConfig;

public class AuthenticationMainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		LoginManager login=ctx.getBean(LoginManager.class);
		login.verifyLogin();

	}

}
