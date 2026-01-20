package com.service;

import org.springframework.stereotype.Service;

@Service
public class DiscountService {
	public double discountcalculation(double price,int discount) {
		return price-(price*discount/100);
	}

}
