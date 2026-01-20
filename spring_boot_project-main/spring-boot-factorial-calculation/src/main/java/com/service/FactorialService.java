package com.service;

import org.springframework.stereotype.Service;

@Service
public class FactorialService {
public double checkfactorial(int num) {
	if(num < 0) {
		throw new IllegalArgumentException("Invalid Input");
	}
	double fact=1;
	for(int i=1;i<=num;i++) {
		fact = fact * i;
	}
	return fact;
}
}
