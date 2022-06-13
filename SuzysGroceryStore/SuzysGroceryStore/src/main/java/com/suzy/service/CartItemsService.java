package com.suzy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suzy.entity.Cart;
import com.suzy.entity.CartItems;
import com.suzy.entity.Product;
import com.suzy.entity.User;
import com.suzy.repo.CartItemsRepo;
import com.suzy.repo.CartRepo;
import com.suzy.repo.ProductRepo;
import com.suzy.repo.UserRepo;

@Service
public class CartItemsService {

	@Autowired
	CartItemsRepo cartItemsRepo;
	@Autowired
	ProductRepo productRepo;
	@Autowired
	CartRepo cartRepo;
	
	
	public CartItems saveCartItem(CartItems cartItem) {
		return cartItemsRepo.save(cartItem);
	}
	
	public void addCartItem(Cart cart, Product product, CartItems cartItem) {
		product.addCartItem(cartItem);
		cart.addCartItem(cartItem);
		cartRepo.save(cart);
		
	}
	
	public CartItems getCartItemById(Integer id) {
		
		if(cartItemsRepo.findById(id).isPresent()) {

			return cartItemsRepo.findById(id).get();
		
		}
		
		return null;
	}
}
