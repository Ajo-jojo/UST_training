package com.service;

import org.springframework.stereotype.Service;

@Service
public class SICservive {
	public String sic(double price,double rate,int year) {
		double sip=(price*rate*year)/100;
		return "The simple interest is "+sip; 
	}

}
