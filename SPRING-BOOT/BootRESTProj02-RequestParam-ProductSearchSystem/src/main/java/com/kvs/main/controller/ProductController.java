package com.kvs.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kvs.main.model.Product;
import com.kvs.main.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	ProductService productService;

	public ProductController(ProductService productService) {
		super();
		this.productService = productService;
	}
	
	@GetMapping("/search")
    public List<Product> searchProducts(
            @RequestParam String category,
            @RequestParam double maxPrice) {

        return productService.getProductsByCategoryAndPrice(category, maxPrice);
    }
	// localhost:8080/search?category=category&&maxPrice=maxPrice
	
	

}
