package com.kvs.main.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.JoinColumn;  
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "Movies1")

public class Movie {
	
	@Id
	Long id ;
	String title;
	String genre;// — Movie genre (e.g., “Sci-Fi”, “Drama”)
	
	

	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
	    name = "movie_actor_map",
	    joinColumns = @JoinColumn(name = "movie_id"),
	    inverseJoinColumns = @JoinColumn(name = "actor_id")
	)
	private List<Actor> actors = new ArrayList<>();

}
