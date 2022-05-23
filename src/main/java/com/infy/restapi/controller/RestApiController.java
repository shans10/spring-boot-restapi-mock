package com.infy.restapi.controller;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infy.restapi.entities.Input;
import com.infy.restapi.entities.Results;
import com.infy.restapi.services.InputService;

@RestController
public class RestApiController {
	
	@Autowired
	private InputService inputService;
	
	@PostMapping("/api/numberoperations")
	public ResponseEntity<Object> POST(@RequestBody Input input) {

		// Create map for JSON response
		Map<String, Object> map = new LinkedHashMap<>();

		// Performing operations on input
		List<Integer> numbers = this.inputService.setInput(input);
		Integer sum = inputService.addNumbers(numbers);
		Integer average = inputService.avgNumbers(numbers);
		List<Integer> greaterThanAverage = inputService.greaterThanAvg(numbers);
		Results results = new Results(sum, average, greaterThanAverage);
		
		// Creating JSON success response
		map.put("status", "SUCCESS");
		map.put("results", results);

		// Return success JSON response
		return new ResponseEntity<Object>(map, HttpStatus.OK);
	}
}