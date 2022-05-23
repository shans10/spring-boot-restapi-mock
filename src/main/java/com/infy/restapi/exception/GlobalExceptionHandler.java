package com.infy.restapi.exception;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.fasterxml.jackson.databind.JsonMappingException;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	// Handle exception for non-integer inputs
	@ExceptionHandler(JsonMappingException.class)
	public ResponseEntity<Object> handleJsonMappingException(JsonMappingException e) {
		
		Map<String, Object> errorResponse = new LinkedHashMap<>();
		errorResponse.put("status", "FAILED");
		errorResponse.put("msg", "Numeric input expected, received invalid numbers in input");

		return new ResponseEntity<Object>(errorResponse, HttpStatus.BAD_REQUEST);
	}

}
