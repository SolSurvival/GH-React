package com.suzy.controller;

import com.suzy.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ProductController {
    
@Autowired
ProductService productService;

@GetMapping("/products")
public String displayProducts(Model model){
    return "products";
}

@GetMapping("/products/{userId}")
public String displayProductsSignedIn(@PathVariable("userId") Integer userId, Model model){
    return "products";
}

}