package com.suzy.repo;
import com.suzy.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo {


public interface ProductRepo extends JpaRepository<Product, Integer>{
    
    @Query(value="select * from user where email = ?1 && pass = ?2", nativeQuery=true)
    public User findByTheEmailAndPassword(String email, String pass);
}
}
