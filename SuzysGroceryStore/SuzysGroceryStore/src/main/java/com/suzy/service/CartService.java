package com.suzy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suzy.entity.Cart;
import com.suzy.entity.CartItems;
import com.suzy.entity.Product;
import com.suzy.entity.User;
import com.suzy.repo.CartRepo;
import com.suzy.repo.ProductRepo;
import com.suzy.repo.UserRepo;

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
