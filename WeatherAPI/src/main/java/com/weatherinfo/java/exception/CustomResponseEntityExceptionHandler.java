package com.weatherinfo.java.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class CustomResponseEntityExceptionHandler extends ResponseEntityExceptionHandler{

	@ExceptionHandler(InvalidZipCodeException.class)
	public final ResponseEntity<Object> handleInvalidZipCodeException
	(Exception ex, WebRequest request) {
		
		ExceptionResponse response = new ExceptionResponse(new Date(), ex.getMessage(), request.getDescription(false));
		
		return new ResponseEntity(response, HttpStatus.BAD_REQUEST);
	}
/*	
	@ExceptionHandler(InteralServerException.class)
	public final ResponseEntity<Object> handleInteralServerException(Exception ex, WebRequest request) {
		
		ExceptionResponse response = new ExceptionResponse(new Date(), ex.getMessage(), request.getDescription(false));
		
		return new ResponseEntity(response, HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	
*/
}
