package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com")
public class SpringBootSimpleCalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSimpleCalculatorApplication.class, args);
	}

}
