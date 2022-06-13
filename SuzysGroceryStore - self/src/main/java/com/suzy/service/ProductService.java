package com.suzy.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suzy.entity.Product;
import com.suzy.entity.User;
import com.suzy.repo.*;

@Service
public class ProductService {

    @Autowired
    UserRepo userRepo;

    public Product saveProduct(Product product){
        return productRepo.save(product);
    }

    public Product getProductById(Integer id){
        if(productRepo.findById(id).isPresent()){
            return productRepo.findById(id).get();
        }
        return null;
    }
}
