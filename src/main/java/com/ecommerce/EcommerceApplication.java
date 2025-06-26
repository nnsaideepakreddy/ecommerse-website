package com.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.ecommerce.repository")
@EntityScan(basePackages = "com.ecommerce.model")
public class EcommerceApplication {

    public static void main(String[] args) {
        System.out.println("Starting E-Commerce App...");
        SpringApplication.run(EcommerceApplication.class, args);
    }
}
