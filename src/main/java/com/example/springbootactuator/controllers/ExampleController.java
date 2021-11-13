package com.example.springbootactuator.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ExampleController {

    @GetMapping("/first")
    public String firstApiResponse() {
        return "Hello this is first api response";
    }

    @GetMapping("/second")
    public String secondApiResponse() {
        return "And this is second api response";
    }
}
