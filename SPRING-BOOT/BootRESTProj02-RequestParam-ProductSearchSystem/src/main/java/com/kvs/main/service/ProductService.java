package com.kvs.main.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.kvs.main.model.Product;
@Service
public class ProductService {
	
	
	 private List<Product> productList = new ArrayList<>();

	    // Constructor to load data
	    public ProductService() {
	        productList.add(new Product(1, "Laptop", "Electronics", 60000D));
	        productList.add(new Product(2, "Mobile", "Electronics", 30000D));
	        productList.add(new Product(3, "TV", "Electronics", 450000D));
	        productList.add(new Product(4, "Shoes", "Fashion", 2000D));
	        productList.add(new Product(5, "Shirt", "Fashion", 1500D));
	    }
	 // Method to filter products
	    public List<Product> getProductsByCategoryAndPrice(String category, double maxPrice) {

	        return productList.stream()
	                .filter(p -> p.getCategory().equalsIgnoreCase(category)
	                        && p.getPrice() <= maxPrice)
	                .collect(Collectors.toList());
	    }
	    

}
