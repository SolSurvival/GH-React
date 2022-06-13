package com.stacy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.stacy.entity.House;
import com.stacy.service.HouseService;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping(value="/agent")
public class HouseRestController {
	
	@Autowired
	HouseService houseService;

	
	@RequestMapping(value="/createListing/{agentId}", method=RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Object> createHouse(@PathVariable Integer agentId, RequestBody House house) {
		try {
			houseService.saveHouse(agentId, house);
			return new ResponseEntity<Object>(null, HttpStatus.CREATED);
		} catch(Exception e) {
			return new ResponseEntity<Object>(e, HttpStatus.BAD_REQUEST);
		}
	}
	
	
	

}

