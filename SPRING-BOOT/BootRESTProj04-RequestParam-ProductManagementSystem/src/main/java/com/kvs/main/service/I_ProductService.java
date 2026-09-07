package com.kvs.main.service;

import java.util.List;
import java.util.Optional;

import com.kvs.main.entity.Product;

public interface I_ProductService {
	Product addProduct(Product p);
	List<Product>getAllProducts();
	Optional<Product> getProductById(Long id);
	String updateProduct(Long id,Product p);
	String deleteProduct(Long id);
	

}
