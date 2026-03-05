package com.kvs.main.service;

import org.springframework.data.domain.Page;

import com.kvs.main.entity.Product;

public interface IProductService {
	void addAll();
	public Iterable<Product> getAllProductsSorted(String sortField, boolean ascending);
	
	Page<Product> getPagedProducts(int page, int size, String sortField, boolean ascending);

}
