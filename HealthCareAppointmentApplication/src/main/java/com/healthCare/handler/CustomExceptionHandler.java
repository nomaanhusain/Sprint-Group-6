package com.healthCare.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.healthCare.exception.CenterNotFoundException;
import com.healthCare.exception.InvalidUsernameException;

@RestControllerAdvice
public class CustomExceptionHandler {

	@ExceptionHandler(CenterNotFoundException.class)
	public ResponseEntity<String> handleEmployeeNotFound(CenterNotFoundException cnfe)
	{
		return new ResponseEntity<String>(cnfe.getMessage(),HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(InvalidUsernameException.class)
	public ResponseEntity<String> handleUserNotFound(InvalidUsernameException iue) {
		return new ResponseEntity<String>(iue.getMessage(), HttpStatus.NOT_FOUND);
	}
}