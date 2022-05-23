package com.infy.restapi.services;

import java.util.List;

import com.infy.restapi.entities.Input;
import com.infy.restapi.entities.Results;

public interface InputService {
	
	// Take input from POST method
	public List<Integer> setInput(Input numbers);
	
	// Add all numbers taken as input
	public int addNumbers(List<Integer> numbers);
	
	// Average all numbers taken as input
	public int avgNumbers(List<Integer> numbers);
	
	// Greater than average
	public List<Integer> greaterThanAvg(List<Integer> numbers);
	
	// Create results object
	public Results setResults(Integer sum, Integer average, List<Integer> greaterThanAvg);
}