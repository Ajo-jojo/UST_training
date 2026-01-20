package com.service;

import org.springframework.stereotype.Service;

@Service
public class EvenOddService {
	public String evenodd(int num) {
		if(num%2 == 0) {
			return "number is even";
		}else {
			return "number is odd";
		}
	}

}
