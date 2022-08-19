package com.example.budgetpros.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class HomeController {

    @GetMapping("/home")
    public String returnHomePage() {
        return "index";
    }
}