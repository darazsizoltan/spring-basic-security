package com.dz.springbasicsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String home() {
        return ("<h1>For everybody</h1>");
    }

    @GetMapping("/user")
    public String user() {
        return ("<h1>For user</h1>");
    }

    @GetMapping("/admin")
    public String admin() {
        return ("<h1>For admin</h1>");
    }
}
