package com.kvs.main.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table

public class Actor {

	
	Long id ;//— Primary Key (Auto-generated)
	String name;// — Actor’s full name
	int age;// — Actor’s age
	

	
	@ManyToMany(mappedBy = "actors")
    private List<Movie> movies = new ArrayList<>();


}
