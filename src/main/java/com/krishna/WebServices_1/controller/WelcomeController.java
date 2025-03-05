package com.krishna.WebServices_1.controller;

import com.krishna.WebServices_1.service.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @Autowired
    WelcomeService service;

    @GetMapping("/welcome")
    public String getWelcome() {
        return service.getMessage();
    }
}
