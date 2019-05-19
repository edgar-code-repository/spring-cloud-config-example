package com.example.configclientexample.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageRestController {

    @Value("${title}")
    private String title;

    @Value("${message}")
    private String message;

    @RequestMapping("/message")
    public String getMessage() {
        return "<h2>" + this.title + "</h2><br/>" + this.message;
    }


}
