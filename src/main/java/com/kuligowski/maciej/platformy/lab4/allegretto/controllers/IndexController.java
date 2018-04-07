package com.kuligowski.maciej.platformy.lab4.allegretto.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/")
    public void index()
    {

    }
}
