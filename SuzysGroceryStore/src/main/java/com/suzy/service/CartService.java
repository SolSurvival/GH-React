package com.suzy.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suzy.entity.Product;
import com.suzy.entity.User;
import com.suzy.repo.*;

@Service
public class CartService {

    @Autowired
    CartRepo cartRepo;

    public Cart saveCart(Cart cart){
        return cartRepo.save(cartRepo);
    }

    public Cart getCartById(Integer id){
        if(cartRepo.findById(id).isPresent()){
            return cartRepo.findById(id).get();
        }
        return null;
    }
}
