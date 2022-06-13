package com.suzy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.suzy.entity.CartItems;
import com.suzy.entity.Product;
import com.suzy.entity.User;
import com.suzy.service.CartItemsService;
import com.suzy.service.CartService;
import com.suzy.service.ProductService;
import com.suzy.service.UserService;

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
