package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.service.PalindromeService;

@RestController
public class PalindromeController {
	@Autowired
	PalindromeService palindromeService;
	 @GetMapping(value="palindrome/{word}")
	 public String palindrome(@PathVariable String word) {
		 return palindromeService.checkpalindrome(word);
	 }

}
