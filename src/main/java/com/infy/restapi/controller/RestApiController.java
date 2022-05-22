package com.infy.restapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infy.restapi.entities.Input;
import com.infy.restapi.services.InputService;

@RestController
public class RestApiController {
	
	@Autowired
	private InputService inputService;
	
	@PostMapping("/api/numberoperations")
	public Input getInput(@RequestBody Input input) {
		return this.inputService.addNumbers(input);
	}
}
