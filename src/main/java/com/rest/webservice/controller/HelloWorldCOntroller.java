package com.rest.webservice.controller;

import com.rest.webservice.model.HelloWorldBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldCOntroller {

    @GetMapping("/api/v1/helllo")
    public String sayHello(){
        return "Hello World";
    }

    @GetMapping("/api/v1/helloWorldBean")
    public HelloWorldBean helloWorldBean(){
        return  new HelloWorldBean("Hello World Bean");
    }
}
