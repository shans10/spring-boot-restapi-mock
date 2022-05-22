package com.infy.restapi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.infy.restapi.entities.Input;

@Service
public class InputServiceImpl implements InputService {

	List<Input> list;
	
	public InputServiceImpl() {
		list = new ArrayList<>();
	}

	@Override
	public Input addNumbers(Input numbers) {
		list.add(numbers);
		return numbers;
	}

}