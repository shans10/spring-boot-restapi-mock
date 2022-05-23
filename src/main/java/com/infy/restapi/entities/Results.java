package com.infy.restapi.entities;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Results {
	
	private Integer sum;
	
	private Integer average;
	
	private List<Integer> greaterThanAverage;
}
