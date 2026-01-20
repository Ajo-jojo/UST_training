package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.service.EvenOddService;

@RestController
public class EvenOddController {
	@Autowired
	EvenOddService evenOddService;
	
	@GetMapping(value="evenodd/{num}")
	public String getEvenodd(@PathVariable int num) {
		return evenOddService.evenodd(num);
	}

}
