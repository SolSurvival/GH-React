package com.GH.controller;

import java.util.List;

import com.GH.entity.CartItems;
import com.GH.entity.Product;
import com.GH.entity.User;
import com.GH.service.CartItemsService;
import com.GH.service.CartService;
import com.GH.service.ProductService;
import com.GH.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CartController {

	@Autowired
	CartService cartService;
	@Autowired
	UserService userService;
	@Autowired
	ProductService productService;
	@Autowired
	CartItemsService cartItemsService;
	
	@GetMapping("/addItemToCart/{userId}/{productId}")
	public String addProductToCartComfirmation(@PathVariable Integer userId, 
			@PathVariable Integer productId, Model model) {
		
		User loggedInUser = userService.findUserById(userId);
		Product product = productService.getProductById(productId);
		
		model.addAttribute("loggedInUser", loggedInUser);
		model.addAttribute("product", product);
		model.addAttribute("cartItem", new CartItems());
		
		return "addToCart";
	}
	
	@PostMapping("/addItemToCart/{userId}/{productId}")
	public String addProductToCart(@PathVariable Integer userId, 
			@PathVariable Integer productId, 
			@ModelAttribute CartItems cartItem,
			Model model) {
		
		User loggedInUser = userService.findUserById(userId);
		Product product = productService.getProductById(productId);
		
	
		cartItemsService.addCartItem(loggedInUser.getCart(), product, cartItem);
		cartItemsService.saveCartItem(cartItem);
		
		
		
		model.addAttribute("loggedInUser", loggedInUser);
		List<Product> allProducts = productService.getAllProducts();
		model.addAttribute("listOfProducts", allProducts);
		
		return "products";
	}
	

}
