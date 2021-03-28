package com.example.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bService")
public class BService implements HelloService{
	
	public String getMessage() {
		return "Hello B";
	}

}
