package com.lucas.fullstack.controller;

import com.lucas.fullstack.model.User;
import com.lucas.fullstack.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServices service;

    @ResponseStatus(HttpStatus.ACCEPTED)
    @PostMapping
    public User addUser(@RequestBody User user){
        return service.addUser(user);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<User> listar(){
        return service.listar();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public User listarId(@PathVariable String id){
        return service.listarPorId(id);
    }
}
