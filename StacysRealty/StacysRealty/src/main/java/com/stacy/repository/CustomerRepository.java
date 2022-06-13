package com.stacy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.stacy.entity.Customer;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	
	@Query(value="SELECT U FROM user U where U.email = ?1 and U.password = ?2", nativeQuery=true)
	Customer findByEmailAndPassword(String email, String password);
	
	@Query(value="SELECT U FROM user U where U.email = ?1", nativeQuery=true)
	Customer findByEmail(String email);

}