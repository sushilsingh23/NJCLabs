package com.njclabs.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ProductExceptionController extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(value = ProductNotFoundException.class)
	public ResponseEntity<Object> productNotException(ProductNotFoundException e)
	{
		return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value = DuplicateProductIdException.class)
	public ResponseEntity<Object> duplicateIdFoundException(DuplicateProductIdException e)
	{
		return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
	}
	
	@Override
	public ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException e, HttpHeaders headers,
			HttpStatus status, WebRequest request) {

		return new ResponseEntity<>(e.getBindingResult().getAllErrors().get(0).getDefaultMessage(),
				HttpStatus.INTERNAL_SERVER_ERROR);
	}   
	
}
