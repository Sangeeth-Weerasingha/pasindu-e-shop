package com.pasindu.eshop;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EshopApplication {

    public static void main(String[] args) {
        SpringApplication.run(EshopApplication.class, args);
    }

    @Bean
    CommandLineRunner initData(ProductRepository repo) {
        return args -> {
            if (repo.count() == 0) {
                repo.save(new Product("iPhone 15", 1200, "https://via.placeholder.com/200"));
                repo.save(new Product("Samsung S24", 1100, "https://via.placeholder.com/200"));
                repo.save(new Product("MacBook Pro", 2500, "https://via.placeholder.com/200"));
                repo.save(new Product("AirPods Pro", 250, "https://via.placeholder.com/200"));
                repo.save(new Product("iPad Air", 700, "https://via.placeholder.com/200"));
                repo.save(new Product("Apple Watch", 400, "https://via.placeholder.com/200"));
                System.out.println(">>> 6 Products Inserted to H2 DB!");
            }
        };
    }
}