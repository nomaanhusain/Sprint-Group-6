package com.healthCare.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.healthCare.exception.CenterNotFoundException;
import com.healthCare.exception.InvalidUsernameException;
import com.healthCare.exception.TestNotFoundException;
import com.healthCare.exception.UsernameNotFoundException;

@RestControllerAdvice
public class CustomExceptionHandler {

	@ExceptionHandler(CenterNotFoundException.class)
	public ResponseEntity<String> handleCenterNotFound(CenterNotFoundException cnfe)
	{
		return new ResponseEntity<String>(cnfe.getMessage(),HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(InvalidUsernameException.class)
	public ResponseEntity<String> handleUserNotFound(InvalidUsernameException iue) {
		return new ResponseEntity<String>(iue.getMessage(), HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(UsernameNotFoundException.class)
	public ResponseEntity<String> handleUsernameNotFound(UsernameNotFoundException unf) {
		return new ResponseEntity<String>(unf.getMessage(), HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(TestNotFoundException.class)
	public ResponseEntity<String> handleTestNotFound(TestNotFoundException tnfe)
	{
		return new ResponseEntity<String>(tnfe.getMessage(),HttpStatus.NOT_FOUND);
	}
}