package com.kvs.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kvs.main.entity.Product;
import com.kvs.main.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productRepository;
	
	public void save(Product p) {
		productRepository.save(p);
	}
	
	public Iterable<Product> getAll(){
		return productRepository.findAll();
	}

    public List<Product> getProductsByCategory(String category){
    	return productRepository.getProductsByCategory(category);
    }

    
    public List<Product> getAvailableProducts(){
    	return productRepository.getAvailableProducts();
    }
    
    public List<Product> getProductsCostlierThan(Double minPrice){
    	return productRepository.getProductsCostlierThan(minPrice);
    }


    public List<Product> getAllProductsSortedByPriceDesc(){
    	return productRepository.getAllProductsSortedByPriceDesc();
    }


    public Long getAvailableProductCount() {
    	return productRepository.getAvailableProductCount();
    }

	public Iterable<Product> findAll() {
		
		return productRepository.findAll();
	}
    
}
