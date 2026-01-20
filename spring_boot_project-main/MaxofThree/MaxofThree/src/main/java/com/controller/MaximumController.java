package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.service.MaximumService;

@RestController
public class MaximumController {
	@Autowired
	MaximumService maxService;
	@GetMapping(value="max")
	public String getmaximum(@RequestParam int a,@RequestParam int b,@RequestParam int c) {
		return maxService.Maximum(a, b, c);
	}

}
