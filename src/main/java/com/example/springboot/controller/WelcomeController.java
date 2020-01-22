package com.example.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.service.WelcomeService;

@RestController
public class WelcomeController {
	
	@Autowired
	WelcomeService service;
	
	@RequestMapping(value="/welcome")
	public String showWelcomePage() {
		return service.welcomeMessage();
	}
}
