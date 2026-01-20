package com.tempController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.service.tempService;

@RestController
public class tempController {
	@Autowired
	tempService TempService;
	@GetMapping(value = "celsius-to-fahrenheit/{temp}")
	public String gettemp(@PathVariable("temp")  double temperature) {
		return TempService.convert(temperature) ;
	}


}
