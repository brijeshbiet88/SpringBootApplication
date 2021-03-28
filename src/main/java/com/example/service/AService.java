package com.example.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("aService")
@Primary
public class AService implements HelloService{


	
	@Override
	public String getMessage() {
		return "Hello Service A";
		
		
	}

	
}
