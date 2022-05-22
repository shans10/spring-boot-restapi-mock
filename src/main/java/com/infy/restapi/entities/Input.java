package com.infy.restapi.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Input {
	
    @JsonProperty("input")
	private List<Integer> input;
}
