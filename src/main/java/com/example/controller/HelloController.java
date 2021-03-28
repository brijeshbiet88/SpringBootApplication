package com.example.controller; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.HelloService;

@RestController
public class HelloController {
	
	@Autowired
//	@Qualifier("aService")
	HelloService service;
	
	@GetMapping("/ping")
	public ResponseEntity<String> ping() {
		return new ResponseEntity<String>("Successful ", HttpStatus.OK);
	}
	
	
	@GetMapping("/hello")
	public ResponseEntity<String> sayHello() {
		String helloMsg = service.getMessage();
		return new ResponseEntity<String>(helloMsg, HttpStatus.OK);
	}
	
}
