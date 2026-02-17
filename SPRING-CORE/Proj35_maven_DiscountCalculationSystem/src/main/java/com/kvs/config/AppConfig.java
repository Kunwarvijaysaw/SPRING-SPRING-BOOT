package com.kvs.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.kvs.sbeans.EliteCustomerDiscount;
import com.kvs.sbeans.PremiumCustomerDiscount;
import com.kvs.sbeans.RegularCustomerDiscount;

@Configuration
@ComponentScan(basePackages = "com.kvs")
public class AppConfig {



} 
