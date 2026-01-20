package com.service;

import org.springframework.stereotype.Service;

@Service
public class tempService {
	public String convert(double temp) {
		double fah=(temp*9/5)+32;
		return "The temprature in Fahrenheit is "+fah;
	}

}
