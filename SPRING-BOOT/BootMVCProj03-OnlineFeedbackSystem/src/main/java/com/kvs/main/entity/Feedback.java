package com.kvs.main.entity;

import lombok.Data;


@Data

public class Feedback {
	private String name;
	private String email;
	private Integer rating;// (1–5)
	private String comments;


}
