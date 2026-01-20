package com.service;

import org.springframework.stereotype.Service;

@Service
public class PrimeService {
public String checkprime(int num) {
	  if (num <= 1) {
          return "Number is not prime";
      }

      for (int i = 2; i <= Math.sqrt(num); i++) {
          if (num % i == 0) {
              return "Number is not prime";
          }
      }

      return "Number is prime";
  }
}

