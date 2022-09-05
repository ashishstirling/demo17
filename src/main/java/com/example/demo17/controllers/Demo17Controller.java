package com.example.demo17.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class Demo17Controller {
    @GetMapping("/hello")
    public String getHello() {
        return "Hello World";
    }
}
