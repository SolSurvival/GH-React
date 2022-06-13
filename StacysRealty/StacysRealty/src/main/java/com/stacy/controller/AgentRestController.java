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

import com.stacy.entity.Agent;
import com.stacy.service.AgentService;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping(value="/agent")
public class AgentRestController {
	
	@Autowired
	AgentService agentService;

	
	@RequestMapping(value="/signUp", method=RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Object> saveAgent(@RequestBody Agent agent) {
		try {
			agentService.saveAgent(agent);
			return new ResponseEntity<Object>(agent, HttpStatus.CREATED);
		} catch(Exception e) {
			return new ResponseEntity<Object>(e, HttpStatus.BAD_REQUEST);
		}
	}
	
	@RequestMapping(value="/signIn", method=RequestMethod.POST)
	@ResponseBody
	public Agent getAgent(@RequestBody Agent agent) {
		try {
			Agent loggedInUser = agentService.getAgentByEmailAndPassword(agent.getEmail(), agent.getPassword());
			
			return loggedInUser;
		} catch(Exception e) {
			return null;
		}
	}
	
	@RequestMapping(value="/findAgentByEmail/{email}", method=RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<Agent> getAgentByEmail(@PathVariable String email) {
		try {
			Agent loggedInUser = agentService.getAgentByEmail(email);
			
			if(loggedInUser == null) {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
			
			return new ResponseEntity<Agent>(loggedInUser, HttpStatus.OK);
		} catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	

}
