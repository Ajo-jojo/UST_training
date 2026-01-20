package com.StringReverseService;

import org.springframework.stereotype.Service;

@Service
public class StringReverseService {
	public String reverse(String text ) {
		StringBuilder sb = new StringBuilder(text);
		return "Reversed String is:\n"  +sb.reverse().toString();
		
		
	}
	

}
