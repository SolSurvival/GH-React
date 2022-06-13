package com.GH.controller;

import com.GH.entity.Product;
import com.GH.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestProductController {

	@Autowired
	ProductService productService;

	
	@RequestMapping(value="/createProduct", method=RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Object> createProduct(@RequestBody Product product) {
		
		try {
			productService.saveProduct(product);
			return new ResponseEntity<Object>(product, HttpStatus.OK);
		} catch(Exception e) {
			return new ResponseEntity<Object>(e, HttpStatus.BAD_REQUEST);
		}
	}
	
}
