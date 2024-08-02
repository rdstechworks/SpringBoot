package com.rdstechworks.spring.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestService {

	@GetMapping("/")
	public String start() {
		
		return "Hello!! This is Rest service example. Will see everything including retry operations";
	}
}
