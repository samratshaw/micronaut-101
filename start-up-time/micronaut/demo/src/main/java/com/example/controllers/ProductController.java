package com.example.controllers;

import lombok.extern.slf4j.Slf4j;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.validation.Validated;

@Slf4j
@Controller()
class ProductController {

    @Get("/products")
    public HttpResponse<?> getProducts() {
        log.info("Client request for /products");
        return HttpResponse.status(HttpStatus.OK).body("Micronaut app: Mock response from Products");
    }
}