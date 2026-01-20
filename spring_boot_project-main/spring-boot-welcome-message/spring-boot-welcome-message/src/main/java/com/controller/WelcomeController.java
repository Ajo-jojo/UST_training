package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import com.service.WelcomeService;


@RestController
public class WelcomeController {
	@Autowired
	 WelcomeService welcomeService;
	 
	//http://localhost:8080/welcome
	 @GetMapping(value="welcome", produces = MediaType.TEXT_PLAIN_VALUE)
		 public String welcomeMessage() {
			 return welcomeService.welcome();
			 
		 }
	 }


