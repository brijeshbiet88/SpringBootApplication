package com.example.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.model.Customer;

public interface CustomerService {

	public List<Customer> findAllCustomers();
	
	public Customer findCustomerById (String id);
}
