package com.example.demo.controller;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id="customActuator")
public class CustomActuator {
	
	@ReadOperation
	public String currentDbDetails() {
		return "Give current db status of the application";
	}

}
