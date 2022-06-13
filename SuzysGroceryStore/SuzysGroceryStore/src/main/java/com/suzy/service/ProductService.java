package com.suzy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suzy.entity.CartItems;
import com.suzy.entity.Product;
import com.suzy.entity.User;
import com.suzy.repo.ProductRepo;
import com.suzy.repo.UserRepo;

@Service
public class ProductService {

	@Autowired
	ProductRepo productRepo;
	
	
	public Product saveProduct(Product product) {
		return productRepo.save(product);
	}

	public List<Product> getAllProducts() {
		return productRepo.findAll();
	}

	
	public Product getProductById(Integer id) {
		
		if(productRepo.findById(id).isPresent()) {

			return productRepo.findById(id).get();
		
		}
		
		return null;
	}
}
