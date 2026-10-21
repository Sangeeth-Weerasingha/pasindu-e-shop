package com.pasindu.eshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EshopApplication {

    public static void main(String[] args) {
        SpringApplication.run(EshopApplication.class, args);
    }

   @Bean
CommandLineRunner init(ProductRepository repo) {
    return args -> {
        repo.save(new Product("iPhone 15 Pro Max", 385000, "https://images.unsplash.com/photo-1592750475338-74b7b21085ab?w=500", "Phones"));
        repo.save(new Product("Samsung S24 Ultra", 320000, "https://images.unsplash.com/photo-1598327105666-5b89351aff97?w=500", "Phones"));
        repo.save(new Product("MacBook Air M2", 285000, "https://images.unsplash.com/photo-1541807084-5c52b6b3adef?w=500", "Laptops"));
        repo.save(new Product("Sony WH-1000XM5", 65000, "https://images.unsplash.com/photo-1546435770-a3e426bf472b?w=500", "Audio"));
        repo.save(new Product("Nike Air Jordan", 18500, "https://images.unsplash.com/photo-1542291026-7eec264c27ff?w=500", "Shoes"));
        repo.save(new Product("Apple Watch Ultra", 145000, "https://images.unsplash.com/photo-1579586337278-3befd40fd17a?w=500", "Watches"));
    };
}
}