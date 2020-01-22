package com.example.springboot.controller;


import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.configuration.BasicConfiguration;
import com.example.springboot.service.WelcomeService;

@RestController
public class WelcomeController {
	
	@Autowired
	WelcomeService service;
	
	@Autowired
	private BasicConfiguration configuration;
	
	@RequestMapping(value="/welcome")
	public String showWelcomePage() {
		return service.welcomeMessage();
	}
	
	@RequestMapping("/dynamic-configuration")
	public Map dynamicConfiguration() {
		
		Map map = new HashMap();
		
		map.put("message", configuration.getMessage());
		map.put("number", configuration.getNumber());
		map.put("value", configuration.isValue());
		
		return map;
	}
}
