package com.example.AiChat.AIchat.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	
		// TODO Auto-generated method stub
			@GetMapping("/hello")
			public String helloWorld() {
				return "Hello Sahil!";
			}
	}
