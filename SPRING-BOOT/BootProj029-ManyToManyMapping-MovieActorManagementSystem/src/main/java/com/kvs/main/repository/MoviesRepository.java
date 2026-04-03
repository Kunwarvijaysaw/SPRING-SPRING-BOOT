package com.kvs.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kvs.main.entity.Movie;

public interface MoviesRepository extends JpaRepository<Movie, Long> {

}
