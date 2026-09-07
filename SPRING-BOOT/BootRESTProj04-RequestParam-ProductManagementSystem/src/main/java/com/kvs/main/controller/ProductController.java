package com.kvs.main.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kvs.main.entity.Product;
import com.kvs.main.service.I_ProductService;

@RestController
@RequestMapping("/api/product")
public class ProductController {
	
	@Autowired
	private I_ProductService iProService;
	
	@PostMapping("/add")
	public ResponseEntity<String> addProduct(@RequestBody Product p) {
	    Product add = iProService.addProduct(p);
	    if(add != null) {
	        return new ResponseEntity<>("Product Added Successfully", HttpStatus.OK);
	    } else {
	        return new ResponseEntity<>("Invalid Product Details", HttpStatus.BAD_REQUEST);
	    }
	}
	
	@GetMapping("/view")
	public List<Product> getAllProducts(){
		return iProService.getAllProducts();
		
	}
	
	@GetMapping("/viewbyid/{id}")
	public Optional<Product> getProductById(@PathVariable Long id){
		return iProService.getProductById(id);
		
	}
		
	

}
