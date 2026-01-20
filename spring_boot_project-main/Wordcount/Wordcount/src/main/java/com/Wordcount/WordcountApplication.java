package com.Wordcount;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com")
public class WordcountApplication {

	public static void main(String[] args) {
		SpringApplication.run(WordcountApplication.class, args);
	}

}
