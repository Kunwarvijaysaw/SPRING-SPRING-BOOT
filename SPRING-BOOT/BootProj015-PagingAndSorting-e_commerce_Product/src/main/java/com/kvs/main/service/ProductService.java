package com.kvs.main.service;



import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.kvs.main.entity.Product;
import com.kvs.main.repository.ProducrRepository;

@Service
public class ProductService implements IProductService {
	@Autowired
	ProducrRepository productRepo;
  
	@Override
	public Iterable<Product> getAllProductsSorted(String sortField, boolean ascending) {
		
		Sort sort=Sort.by(ascending?Direction.ASC:Direction.DESC,sortField);
		Iterable<Product> it=productRepo.findAll(sort);
		return it;
		
	}

	@Override
	public Page<Product> getPagedProducts(int page, int size, String sortField, boolean ascending) {
		Sort sort=Sort.by(ascending?Direction.ASC:Direction.DESC,sortField);
		
		Pageable pr =  PageRequest.of(page, size, sort);
		Page<Product> all = productRepo.findAll(pr);
		return all;
	}

	@Override
	public void addAll() {

	    List<Product> list = Arrays.asList(
	        new Product(1, "iPhone", "Electronics", 90000.0),
	        new Product(2, "Book", "Education", 300.0),
	        new Product(3, "Laptop", "Electronics", 75000.0),
	        new Product(4, "Shoes", "Footwear", 5000.0),
	        new Product(5, "Fridge", "Appliances", 25000.0)
	    );

	    productRepo.saveAll(list);
	    System.out.println("Data Added");
	}

}
