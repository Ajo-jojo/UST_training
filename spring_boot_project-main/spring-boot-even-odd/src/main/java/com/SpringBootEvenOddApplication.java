package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com")
public class SpringBootEvenOddApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEvenOddApplication.class, args);
	}

}
