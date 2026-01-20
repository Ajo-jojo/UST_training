package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.service.CalculatorService;

@RestController
public class CalculatorController {
	@Autowired
	CalculatorService calculatorservice;
	//http://localhost:8080/add?a=10&b=20
    @GetMapping(value="add")
    public int claculatorAdding(@RequestParam int a, @RequestParam int b) {
    	return calculatorservice.add(a,b);
    }

}
