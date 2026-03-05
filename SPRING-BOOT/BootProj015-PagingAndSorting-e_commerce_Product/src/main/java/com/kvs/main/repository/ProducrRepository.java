package com.kvs.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.kvs.main.entity.Product;

public interface ProducrRepository extends CrudRepository<Product, Long>,PagingAndSortingRepository<Product, Long>{

}
