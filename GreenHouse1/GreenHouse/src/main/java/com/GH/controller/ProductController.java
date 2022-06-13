package com.GH.controller;

import java.util.List;

import com.GH.entity.Product;
import com.GH.entity.User;
import com.GH.service.ProductService;
import com.GH.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ProductController {

	@Autowired
	ProductService productService;

	@Autowired
	UserService userService;
	
	@GetMapping("/products")
	public String displayProducts(Model model) {
		List<Product> allProducts = productService.getAllProducts();
		model.addAttribute("listOfProducts", allProducts);
		return "products";
	}
	

	@GetMapping("/products/{userId}")
	public String displayProductsSignedIn(@PathVariable("userId") Integer userId, Model model) {
		List<Product> allProducts = productService.getAllProducts();
		User loggedInUser = userService.findUserById(userId);
		model.addAttribute("listOfProducts", allProducts);
		model.addAttribute("loggedInUser", loggedInUser);
		return "products";
	}
}
