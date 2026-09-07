package com.kvs.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kvs.main.entity.Product;
import com.kvs.main.repository.ProductRepository;

@Service

public class ProductService implements I_ProductService{
	
	@Autowired
	private ProductRepository productRepo;

	@Override
	public Product addProduct(Product p) {
		Product add=productRepo.save(p);
		return add;
		
	}

	@Override
	public List<Product> getAllProducts() {
		return productRepo.findAll();
	}

	@Override
	public Optional<Product> getProductById(Long id) {
		return productRepo.findById(id);
	}

	@Override
	public String updateProduct(Long id, Product p) {
		return null;
	}

	@Override
	public String deleteProduct(Long id) {
		return null;
	}

}
