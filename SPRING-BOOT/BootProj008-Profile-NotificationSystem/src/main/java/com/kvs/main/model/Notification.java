package com.kvs.main.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Notification {
	String message;
	int id;
	String recipient;
	
	

}
