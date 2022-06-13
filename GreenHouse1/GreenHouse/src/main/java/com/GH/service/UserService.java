package com.GH.service;

import com.GH.entity.Cart;
import com.GH.entity.User;
import com.GH.repo.CartRepo;
import com.GH.repo.UserRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	UserRepo userRepo;
	
	@Autowired
	CartRepo cartRepo;

	public User saveUser(User user) {
		createUserCart(user);
		return userRepo.save(user);
	}
	
	public void createUserCart(User user) {
		Cart newUserCart = new Cart();
		cartRepo.save(newUserCart);
		user.setCart(newUserCart);
		userRepo.save(user);
	}
	
	public User signInUser(String email, String password) {
		
		return userRepo.findByTheEmailAndPassword(email, password);
	}
	
	public User findUserById(Integer userId) {
		
		if (userRepo.findById(userId).isPresent()) {
			return userRepo.findById(userId).get();
		}
		return null;
	}

	public User findUserByEmail(String email){
		return userRepo.findByEmail(email);
	}
}
