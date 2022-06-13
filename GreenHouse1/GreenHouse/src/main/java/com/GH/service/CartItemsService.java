package com.GH.service;

import com.GH.entity.Cart;
import com.GH.entity.CartItems;
import com.GH.entity.Product;
import com.GH.entity.User;
import com.GH.repo.CartItemsRepo;
import com.GH.repo.CartRepo;
import com.GH.repo.ProductRepo;
import com.GH.repo.UserRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
