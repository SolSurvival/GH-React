package com.GH.service;

import java.util.List;

import com.GH.entity.CartItems;
import com.GH.entity.Product;
import com.GH.entity.User;
import com.GH.repo.ProductRepo;
import com.GH.repo.UserRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
