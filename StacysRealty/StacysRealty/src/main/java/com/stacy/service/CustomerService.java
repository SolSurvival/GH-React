package com.stacy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stacy.entity.Customer;
import com.stacy.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	
	public void saveCustomer(Customer customer) {
		customerRepository.save(customer);
	}

	public Customer getCustomerById(Integer customerId) {
		return customerRepository.findById(customerId).get();
	}

	public Customer getCustomerByEmail(String email) {
		return customerRepository.findByEmail(email);
	}
	
	public Customer getCustomerByEmailAndPassword(String email, String password) {
		return customerRepository.findByEmailAndPassword(email, password);
	}
	
}
