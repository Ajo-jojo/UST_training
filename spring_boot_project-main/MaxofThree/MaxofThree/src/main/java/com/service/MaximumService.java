package com.service;

import org.springframework.stereotype.Service;

@Service
public class MaximumService {
	public String Maximum(int a ,int b,int c) {
		if(a>b && a>c) {
			return "largest value is " + a;
		}else if (b > a && b > c) {
			return "largest value is "+ b;
		}else {
			return "largest value is "+ c;
		}
			
	}
}
