package com.example.demo17.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class Demo17ControllerTests {
    @Autowired
    private Demo17Controller demo17Controller;
    @Test
    void testGetHello() {
        assertEquals("Hello World", demo17Controller.getHello().getMessage());
    }
}
