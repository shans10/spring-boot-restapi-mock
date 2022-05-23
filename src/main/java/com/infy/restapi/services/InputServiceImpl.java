package com.infy.restapi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.infy.restapi.entities.Input;
import com.infy.restapi.entities.Results;

import lombok.NoArgsConstructor;

@Service
@NoArgsConstructor
public class InputServiceImpl implements InputService {

	List<Input> list = new ArrayList<>();
	
	@Override
	public List<Integer> setInput(Input numbers) {
		list.add(numbers);
		return numbers.getInput();
	}

	@Override
	public int addNumbers(List<Integer> numbers) {
		int sum = 0;
		for(int number : numbers) {
			sum += number;
		}
		return sum;
	}

	@Override
	public int avgNumbers(List<Integer> numbers) {
		int avg = (addNumbers(numbers) / numbers.size()); 
		return avg;
	}

	@Override
	public List<Integer> greaterThanAvg(List<Integer> numbers) {
		int avg = avgNumbers(numbers);
		List<Integer> greaterThanAvg = new ArrayList<>();
		for(int number : numbers) {
			if(number > avg) {
				greaterThanAvg.add(number);
			}
		}
		return greaterThanAvg;
	}

	@Override
	public Results setResults(Integer sum, Integer average, List<Integer> greaterThanAverage) {
		Results results = new Results();
		results.setSum(sum);
		results.setAverage(average);
		results.setGreaterThanAverage(greaterThanAverage);
		return results;
	}
}