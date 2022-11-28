package com.lucas.fullstack.login_register.controller;

import com.lucas.fullstack.login_register.model.User;
import com.lucas.fullstack.login_register.services.UserServices;
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
        return service.listAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public User listarId(@PathVariable String id){
        return service.listBydId(id);
    }
}
