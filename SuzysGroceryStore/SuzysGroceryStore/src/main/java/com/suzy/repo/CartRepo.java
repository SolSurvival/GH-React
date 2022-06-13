package com.suzy.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.suzy.entity.Cart;

@Repository
public interface CartRepo extends JpaRepository<Cart, Integer>{

}
