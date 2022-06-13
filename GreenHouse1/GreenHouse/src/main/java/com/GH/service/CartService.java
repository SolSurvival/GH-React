package com.GH.service;

import com.GH.entity.Cart;
import com.GH.entity.CartItems;
import com.GH.entity.Product;
import com.GH.entity.User;
import com.GH.repo.CartRepo;
import com.GH.repo.ProductRepo;
import com.GH.repo.UserRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {

	@Autowired
	CartRepo cartRepo;
	@Autowired
	UserService userService;
	
	
	public Cart saveCart(Cart cart) {
		return cartRepo.save(cart);
	}
	
	public Cart getCartById(Integer id) {
		
		if(cartRepo.findById(id).isPresent()) {

			return cartRepo.findById(id).get();
		
		}
		
		return null;
	}

	
}
