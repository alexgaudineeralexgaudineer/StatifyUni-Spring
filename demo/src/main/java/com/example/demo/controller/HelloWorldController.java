package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;





@RestController
public class HelloWorldController {
	
	@GetMapping("/")
	public String welcomePage()
	{
		return "i hate you will";
	}
	
	@GetMapping("/hello")
	public String helloWorld()
	{
		return "hello world";
	}
}
