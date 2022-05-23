package com.infy.restapi.services;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class InputServiceTest {
	
	@Autowired
	private InputService inputService;

	@Test
	// Test addNumbers function
	void testAddNumbers() {
		// Create a list of integers to perform operations on
		List<Integer> numbers = new ArrayList<>(); 
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		
		// Expected result
		int expectedResult = 60;
		
		// Actual Result
		int actualResult = this.inputService.addNumbers(numbers); 
		
		// Compare if both results are equal
		assertThat(actualResult).isEqualTo(expectedResult);
	}
	
	@Test
	// Test avgNumbers function
	void testAvgNumbers() {
		// Create a list of integers to perform operations on
		List<Integer> numbers = new ArrayList<>(); 
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		
		// Expected result
		int expectedResult = 20;
		
		// Actual Result
		int actualResult = this.inputService.avgNumbers(numbers); 
		
		// Compare if both results are equal
		assertThat(actualResult).isEqualTo(expectedResult);
	}
	
	@Test
	// Test greaterThanAvg function
	void testGreaterThanAvg() {
		// Create a list of integers to perform operations on
		List<Integer> numbers = new ArrayList<>(); 
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		
		// Expected result
		List<Integer> expectedResult = new ArrayList<>();
		expectedResult.add(30);
		
		// Actual Result
		List<Integer> actualResult = new ArrayList<>();
		actualResult = this.inputService.greaterThanAvg(numbers);
		
		// Compare if both results are equal
		assertThat(actualResult).isEqualTo(expectedResult);
	}
}
