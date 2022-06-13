package com.suzy.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suzy.entity.Product;
import com.suzy.entity.User;
import com.suzy.repo.*;

@Service
public class CartItemsService {

    @Autowired
    CartItemsRepo cartItemsRepo;

    public Cart saveCartItems(CartItems cart){
        return cartItemsRepo.save(cartItemsRepo);
    }

    public Cart getCartItemsById(Integer id){
        if(cartItemsRepo.findById(id).isPresent()){
            return cartItemsRepo.findById(id).get();
        }
        return null;
    }
}