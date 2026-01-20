package com.service;

import org.springframework.stereotype.Service;

@Service
public class AgeService {
	public String age(int age) {
		if(age < 18) {
			return "Age Category: Child";
		}else if(age >= 60) {
			return "Age Category: Senior";
		}else {
			return "Age Category : Adult";
		}
	}

}
