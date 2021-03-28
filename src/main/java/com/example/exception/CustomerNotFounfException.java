package com.example.exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerNotFounfException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String errorCode ;
	
	public String getErrorCode() {
		return errorCode;
	}


	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}


	public String getErrorMessage() {
		return errorMessage;
	}


	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}


	private String errorMessage;
	
	
	public CustomerNotFounfException() {
		super();
	}


	public CustomerNotFounfException(String errorCode, String errorMessage) {
		super();
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}


	@Override
	public String toString() {
		return "CustomerNotFounfException [errorCode=" + errorCode + ", errorMessage=" + errorMessage + "]";
	}
	
	
	
}
