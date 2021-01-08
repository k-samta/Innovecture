package com.weatherinfo.java.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.BAD_REQUEST	)
public class InteralServerException extends ExceptionResponse {
	
		public InteralServerException(String message) {
			super(new Date(),message,"Internal Server Error Occured");
		}
	
}
