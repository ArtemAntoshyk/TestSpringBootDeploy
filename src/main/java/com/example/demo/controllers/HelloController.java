package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main")
public class HelloController {
    @Value("${hello}")
    private String hello;

    @GetMapping()
    public String hello() {
        return "hello";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }
}
