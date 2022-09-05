package com.example.demo17.controllers;

import com.example.demo17.models.Demo17Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class Demo17Controller {
    @GetMapping("/hello")
    public Demo17Model getHello() {
        Demo17Model dm = new Demo17Model();
        dm.setMessage("Hello World");
        return dm;
    }
}
