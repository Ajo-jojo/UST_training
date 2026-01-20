package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.service.DiscountService;

@RestController
public class DiscountController {
	@Autowired
	DiscountService discountService;
	@GetMapping(value="discount")
	public double getdiscountammount(@RequestParam double price,@RequestParam int  discount) {
		return discountService.discountcalculation(price, discount);
	}

}
