package com.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcommerceApplication {

	public static void main(String[] args) {
		System.out.println("Starting E-Commerce App...");
		SpringApplication.run(EcommerceApplication.class, args);
	}

}
