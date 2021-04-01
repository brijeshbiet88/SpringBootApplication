package com.example.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Customer;
import com.example.model.Customers;
import com.example.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	@RequestMapping(value = "/all", method = RequestMethod.GET,
			produces = { "application/json", "application/xml" })
	public ResponseEntity<Customers> findAllCustomers (){
		List<Customer> customerList = customerService.findAllCustomers();
		Customers customers = new Customers(customerList);
		return new ResponseEntity<Customers>(customers, HttpStatus.OK);
		
	}
	
	
	@RequestMapping(value = "/find/{Id}" , method = RequestMethod.GET)
	public ResponseEntity<Customer> findExternalCustomer(@PathVariable  String Id){
		Customer customer = customerService.findCustomerById(Id);
		
		return new ResponseEntity<Customer>(customer , HttpStatus.OK);
		
	}
	
	@RequestMapping(value = "/find/all" , method = RequestMethod.GET)
	public ResponseEntity<List<Customer>> findExternalCustomerByAccountType(@RequestParam(value = "type" , required = false )  String type){
		List<Customer> customersByType = customerService.findCustomerByAccountType(type);
		
		return new ResponseEntity<List<Customer>>(customersByType , HttpStatus.OK);
		
	}
	
	@RequestMapping(value = "/patch" , method = RequestMethod.PATCH , produces = "application/json" , consumes = "application/json")
	public ResponseEntity<?> pathDemo(@RequestBody Map <String, Object> updates){
	  
		Map<String , Object> response = new HashMap<String, Object>();
		response.put("patch", "Patch Request Demo with Given fields in the map through postman");
		response.put("School", "ABC");
		response.put("Height", 4.7);
		
		updates.forEach((k , v) -> {
			response.put(k, v);
			System.out.println("Key : "+k);
		});
		
		return new ResponseEntity<>(response , HttpStatus.OK);
		
	}

	
}
