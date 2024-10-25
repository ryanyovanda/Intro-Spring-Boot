package com.example.introspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ApiController {

    @GetMapping("/products")
    public String getProducts() {
        return "The endpoint of Products";
    }

    @GetMapping("/cart")
    public String getCart() {
        return "The endpoint of Cart";
    }

    @GetMapping("/ping")
    public String ping() {
        return "The endpoint of Pong";
    }
}
