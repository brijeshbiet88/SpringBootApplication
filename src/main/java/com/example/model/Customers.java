package com.example.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customers {
	
	private List<Customer> customerList ;

	public Customers(List<Customer> customers) {
		super();
		this.customerList = customers;
	}

	public List<Customer> getCustomers() {
		return customerList;
	}

	public void setCustomers(List<Customer> customers) {
		this.customerList = customers;
	}
}
