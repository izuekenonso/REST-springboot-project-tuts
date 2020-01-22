package com.example.springboot.service;

import org.springframework.stereotype.Component;

@Component
public class WelcomeService {
	public String welcomeMessage() {
		return "Good morning updated";
	}
}
