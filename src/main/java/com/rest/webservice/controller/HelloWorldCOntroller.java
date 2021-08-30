package com.rest.webservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldCOntroller {

    @GetMapping("/api/v1/helllo")
    public String sayHello(){
        return "Hello World";
    }
}
