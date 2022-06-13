package com.stacy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stacy.entity.Address;
import com.stacy.repository.AddressRepository;

@Service
public class AddressService {
	
	@Autowired
	private AddressRepository addressRepository;
	
	
	public void saveAddress(Address address) {
		addressRepository.save(address);
	}

	public Address getAddressById(Integer addressId) {
		return addressRepository.findById(addressId).get();
	}
	
	
	
}
