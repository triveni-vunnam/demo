package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	// whatever the request that i want to execute, i will map that request to this
	// particular method .
	// whenever i'll hit locolhost:8080/ this paarticular method will be called

	// @RequestMapping(value = "/",method = RequestMethod.GET)instead of this we can
	// also use
	
	@GetMapping("/")
	public String helloWorld() {
		return "welcome to my world ";
	}
}
