package com.suzy.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.suzy.entity.Product;
import com.suzy.entity.User;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{

}