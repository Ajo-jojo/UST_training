package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.service.PrimeService;

@RestController
public class PrimeController {
	@Autowired
	PrimeService primeService;
	@GetMapping(value="prime/{num}")
	public String primenumber(@PathVariable int num) {
		return primeService.checkprime(num);
	}

}
