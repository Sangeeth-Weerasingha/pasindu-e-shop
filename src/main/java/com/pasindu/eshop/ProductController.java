package com.pasindu.eshop;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/products")
@CrossOrigin(origins="*")
public class ProductController {
    @GetMapping
    public List<Product> getProducts(){
        return Arrays.asList(
            new Product("AirPods Pro Dark",299.99,"https://images.unsplash.com/photo-1600294037681-c80b4cb5b434?w=400","Audio"),
            new Product("MacBook Pro 16 M3",2499.0,"https://images.unsplash.com/photo-1517336714731-489689fd1ca8?w=400","Laptops"),
            new Product("Mechanical Keyboard",129.99,"https://images.unsplash.com/photo-1589578228447-e1a4e481c6c8?w=400","Accessories"),
            new Product("Nike Air Dark",189.0,"https://images.unsplash.com/photo-1542291026-7eec264c27ff?w=400","Shoes"),
            new Product("Sony Headset",199.99,"https://images.unsplash.com/photo-1546435770-a3e426bf472b?w=400","Audio"),
            new Product("Watch Ultra",399.0,"https://images.unsplash.com/photo-1555421689-3f034debb7a6?w=400","Wearables")
        );
    }
}
