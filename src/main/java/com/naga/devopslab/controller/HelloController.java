package com.naga.devopslab.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Hello from Java DevOps Lab";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Spring Boot application is running successfully";
    }
}