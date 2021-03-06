package com.diagonalley.init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.diagonalley"})
public class DiagonalleyApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiagonalleyApplication.class, args);
	}

}
