package com.example.controlleradvice;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.example.exception.CustomerNotFounfException;
import com.example.exception.ExceptionResponse;

@ControllerAdvice
public class ExceptionControllerAdvice {

	@ExceptionHandler(CustomerNotFounfException.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	public @ResponseBody ExceptionResponse handleResourceNotFound(final CustomerNotFounfException exception,
			final HttpServletRequest request) {
            ExceptionResponse ex = new ExceptionResponse();
            ex.setErrorCode(exception.getErrorCode());
            ex.setErrorMessage(exception.getErrorMessage());

		return ex;
	}	
}
