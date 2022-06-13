package com.stacy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stacy.entity.Agent;
import com.stacy.repository.AgentRepository;

@Service
public class AgentService {
	
	@Autowired
	private AgentRepository agentRepository;
	
	
	public void saveAgent(Agent agent) {
		agentRepository.save(agent);
	}

	public Agent getAgentById(Integer agentId) {
		return agentRepository.findById(agentId).get();
	}

	public Agent getAgentByEmail(String email) {
		return agentRepository.findByEmail(email);
	}
	
	public Agent getAgentByEmailAndPassword(String email, String password) {
		return agentRepository.findByEmailAndPassword(email, password);
	}
	
}
