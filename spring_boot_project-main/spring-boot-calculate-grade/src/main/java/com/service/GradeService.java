package com.service;

import org.springframework.stereotype.Service;

@Service
public class GradeService {
	public String grade(int mark) {
		if(mark >= 90) {
			return "Grade : A";
		}else if(mark >= 75) {
			return "Grade : B";
		}else if(mark >= 60) {
			return "Grade : C";
		}else {
			return "Fail";
		}
	}
	

}
