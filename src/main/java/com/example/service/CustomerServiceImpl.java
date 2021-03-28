package com.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.example.exception.CustomerNotFounfException;
import com.example.model.Customer;



@Component
public class CustomerServiceImpl implements CustomerService{

	static List<Customer> customers = new ArrayList<Customer>();
	static {
		customers.add(new Customer("1", "Ajay", 23, "767438", "Saving",74637.4));
		customers.add(new Customer("2", "Bala", 56, "747538", "Current",11747.3));
		customers.add(new Customer("3", "Carl", 29, "216632", "Current",70637.7));
		customers.add(new Customer("4", "Depp", 48, "932048", "Saving",74927.2));
		customers.add(new Customer("5", "Evan", 29, "536236", "Saving",74127.1));
	}
	
	@Override
	public List<Customer> findAllCustomers() {
		return customers;
	}

	@Override
	public Customer findCustomerById(String Id) {
		 Customer customer = null;
			for (int i = 0 ; i < customers.size() ; i++) {
				if(customers.get(i).getId().equalsIgnoreCase(Id)) {
					customer = customers.get(i);
				}
			}
			
			if(customer == null) {
				
			}
			
			return customer;
	}

	@Override
	public List<Customer> findCustomerByAccountType(String type) {
		List<Customer> customersByAccountType = new ArrayList<Customer>();
		if (type == null || type.isEmpty()) {
			customersByAccountType = customers;
		} else {
			customersByAccountType = customers.stream().filter(c -> c.getAccountType().equalsIgnoreCase(type))
					.collect(Collectors.toList());
		}
		return customersByAccountType;
	}

	
	
}
