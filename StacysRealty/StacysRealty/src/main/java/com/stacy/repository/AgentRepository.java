package com.stacy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.stacy.entity.Agent;


@Repository
public interface AgentRepository extends JpaRepository<Agent, Integer> {
	
	@Query(value="SELECT U FROM user U where U.email = ?1 and U.password = ?2", nativeQuery=true)
	Agent findByEmailAndPassword(String email, String password);
	
	@Query(value="SELECT U FROM user U where U.email = ?1", nativeQuery=true)
	Agent findByEmail(String email);

}