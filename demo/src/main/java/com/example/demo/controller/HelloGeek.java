package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloGeek {
    @GetMapping("/")
    public String display()
    {
        return "hello";
    }
}
