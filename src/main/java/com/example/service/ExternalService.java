package com.example.service;

import com.example.model.Customer;

public interface ExternalService {

	public Customer findExtCustomerById(String id);
	
}
