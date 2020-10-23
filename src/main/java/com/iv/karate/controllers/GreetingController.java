package com.iv.karate.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    private Logger log = LoggerFactory.getLogger("GreetingController");

    @GetMapping(value = "/api/hello", produces = "application/txt")
    public String greet(@RequestParam(required = false, defaultValue = "world") String name) {
        log.info("greetings");

        return String.format("Hello %s!", name);
    }
}
