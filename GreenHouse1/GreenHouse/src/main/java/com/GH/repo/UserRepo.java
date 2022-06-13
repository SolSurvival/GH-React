package com.GH.repo;

import com.GH.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>{

	@Query(value="select * from user where email = ?1 and password = ?2", nativeQuery=true)
	public User findByTheEmailAndPassword(String email, String password);

	@Query(value="select * from user where email = ?1", nativeQuery=true)
	public User findByEmail(String email);
}
