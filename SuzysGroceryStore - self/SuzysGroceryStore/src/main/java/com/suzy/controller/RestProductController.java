package com.suzy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.suzy.entity.Product;
import com.suzy.entity.User;
import com.suzy.service.ProductService;
import com.suzy.service.UserService;

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
