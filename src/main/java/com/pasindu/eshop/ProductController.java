package com.pasindu.eshop;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/products")
@CrossOrigin(origins = "*")
public class ProductController {
    private final ProductRepository repo;
    public ProductController(ProductRepository repo){this.repo=repo;}

    @GetMapping
    public List<Product> getAll(){return repo.findAll();}

    @PostMapping
    public Product add(@RequestBody Product p){return repo.save(p);}

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){repo.deleteById(id);}
}