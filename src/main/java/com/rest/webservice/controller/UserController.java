package com.rest.webservice.controller;

import com.rest.webservice.model.User;
import com.rest.webservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> users(){
        return userService.getAllUsers();
    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable int id){
        return userService.findOne(id);
    }

    @PostMapping("/users")
    public User saveUser(@RequestBody User user ){
        return userService.save(user);
    }
}
