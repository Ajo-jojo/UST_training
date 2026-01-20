package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.service.SICservive;

@RestController
public class SICcontroller {
	@Autowired
	SICservive sicService;
	@GetMapping(value = "interest")
	public String sic(@RequestParam double price,double rate,int year) {
		return sicService.sic(price, rate, year);
	}
	
}
