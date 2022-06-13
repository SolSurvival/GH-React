package com.suzy.repo;

import com.suzy.entity.CartItems;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CartItemsRepo extends JpaRepository<CartItems, Integer>{
    
    
}