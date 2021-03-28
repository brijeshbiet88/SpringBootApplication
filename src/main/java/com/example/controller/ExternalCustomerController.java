package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Customer;
import com.example.service.ExternalService;

@RestController
@RequestMapping("/ext/customer")
public class ExternalCustomerController {
	
	@Autowired
	ExternalService service;

	@RequestMapping(value = "/find/{Id}" , method = RequestMethod.GET)
	public ResponseEntity<Customer> findExternalCustomer(@PathVariable  String Id){
		Customer customer = service.findExtCustomerById(Id);
		
		return new ResponseEntity<Customer>(customer , HttpStatus.OK);
		
	}
}
