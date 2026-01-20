package com.StringReverseController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.StringReverseService.StringReverseService;

@RestController
public class StringReverseController {
	@Autowired
	 StringReverseService Rservice; 
	@GetMapping(value="reverse/{text}")
	public String reverseService(@PathVariable("text") String text){
		return Rservice.reverse(text);
	}
	
	

}
