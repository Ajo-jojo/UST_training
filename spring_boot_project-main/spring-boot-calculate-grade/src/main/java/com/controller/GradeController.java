package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.service.GradeService;

@RestController
public class GradeController {
	
	@Autowired
	GradeService gradeService;
	@GetMapping(value="grade/{mark}")
	public String getGrade(@PathVariable int mark){
		return gradeService.grade(mark);
		
		
	}

}
