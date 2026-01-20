package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.service.AgeService;

@RestController
public class AgeController {
	@Autowired
	AgeService ageService;
	@GetMapping(value="age/{age}")
	public String getCategeory(@PathVariable int age) {
		return ageService.age(age);
	}

}
