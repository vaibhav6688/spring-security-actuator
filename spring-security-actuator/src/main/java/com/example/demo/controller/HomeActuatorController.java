package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeActuatorController {

	@GetMapping("/home")
	public String home() {
		return "Welcome to actuator";
	}
	
	@GetMapping("/user")
	public String user() {
		return "Welcome to user";
	}
	
	
}
