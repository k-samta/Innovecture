package com.weatherinfo.java.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.BAD_REQUEST	)
public class InvalidZipCodeException extends ExceptionResponse {
	
		public InvalidZipCodeException(String message) {
			super(new Date(),message,"InvalidZipCodeException Occured");
		}
	
}
