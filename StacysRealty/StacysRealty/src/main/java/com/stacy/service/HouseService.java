package com.stacy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

import com.stacy.entity.Agent;
import com.stacy.entity.House;
import com.stacy.repository.AddressRepository;
import com.stacy.repository.HouseRepository;

@Service
public class HouseService {
	
	@Autowired
	private HouseRepository houseRepository;
	
	@Autowired
	private AddressService addressService;

	@Autowired
	private AgentService agentService;
	
	public void saveHouse(House house) {
		houseRepository.save(house);
	}

	public List<House>

	public House getHouseById(Integer houseId) {
		return houseRepository.findById(houseId).get();
	}
	
	public void createListing(Integer agentId, House house){

		addressService.saveAddress(house.getAddress());
		house.setDatePosted(new Date());
		houseRepository.save(house);	
		Agent agent = agentService.getAgentById(agentId);
		agent.getHomes().add(house);
		agentService.saveAgent(agent);


	}
	
}
