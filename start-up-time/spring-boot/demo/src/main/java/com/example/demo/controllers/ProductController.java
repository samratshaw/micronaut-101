package com.example.demo.controllers;

import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class ProductController {

    @GetMapping("/products")
    public String getProducts() {
        log.info("Client request for /products");
        return "Spring Boot app: Mock response from Products";
    }
}