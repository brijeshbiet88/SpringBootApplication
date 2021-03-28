package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.controller.ExternalCustomerController;
import com.example.exception.CustomerNotFounfException;
import com.example.model.Customer;

@Service
public class ExternalServiceImple implements ExternalService {

	static List<Customer> customers = new ArrayList<Customer>();
	static {
		customers.add(new Customer("6", "Ramya", 35, "793794", "Saving",74678.2));
		customers.add(new Customer("7", "Jahnvi", 29, "23929", "Saving",74430.1));
	}
	@Override
	public Customer findExtCustomerById(String Id)  {
	  Customer customer = null;
		for (int i = 0 ; i < customers.size() ; i++) {
			if(customers.get(i).getId().equalsIgnoreCase(Id)) {
				customer = customers.get(i);
			}
		}
		
		if(customer == null) {
			throw new CustomerNotFounfException("404", "Customer Not Found In DataBase");
		}
		
		return customer;
			
	}

}
