package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/produtos")
public class ProductController {
    @Autowired
    private ProductService productService;
    @GetMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Product retornaProduto(@RequestParam String id){
        return productService.find(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Product salvaProduto(@RequestBody Product product){
        System.out.println(product);
        return productService.save(product);
    }
}
