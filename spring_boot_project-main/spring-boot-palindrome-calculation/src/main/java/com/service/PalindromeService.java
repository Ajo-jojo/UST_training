package com.service;

import org.springframework.stereotype.Service;

@Service
public class PalindromeService {
	public String checkpalindrome(String word) {
		StringBuilder sb=new StringBuilder(word);
		String reverse=sb.reverse().toString();
		if(reverse.equals(word)) {
			return "word is palindrome";
					
		}else {
			return "word is not palindrome";
		}
		
				
	}

}
