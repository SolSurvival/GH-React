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

import com.stacy.entity.Customer;
import com.stacy.service.CustomerService;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping(value="/customer")
public class CustomerRestController {
	
	@Autowired
	CustomerService customerService;

	
	@RequestMapping(value="/signUp", method=RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Object> saveCustomer(@RequestBody Customer customer) {
		try {
			customerService.saveCustomer(customer);
			return new ResponseEntity<Object>(customer, HttpStatus.CREATED);
		} catch(Exception e) {
			return new ResponseEntity<Object>(e, HttpStatus.BAD_REQUEST);
		}
	}
	
	@RequestMapping(value="/signIn", method=RequestMethod.POST)
	@ResponseBody
	public Customer getUser(@RequestBody Customer customer) {
		try {
			Customer loggedInUser = customerService.getCustomerByEmailAndPassword(customer.getEmail(), customer.getPassword());
			
			return loggedInUser;
		} catch(Exception e) {
			return null;
		}
	}
	
	@RequestMapping(value="/findCustomerByEmail/{email}", method=RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<Customer> getCustomerByEmail(@PathVariable String email) {
		try {
			Customer loggedInUser = customerService.getCustomerByEmail(email);
			
			if(loggedInUser == null) {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
			
			return new ResponseEntity<Customer>(loggedInUser, HttpStatus.OK);
		} catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	

}
