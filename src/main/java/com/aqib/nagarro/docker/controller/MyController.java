package com.aqib.nagarro.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/test-my-docker")
	public String getData() {
		return "Hey! Congrats Docker assignment is working fine.";
	}

}
