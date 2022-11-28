package com.lucas.fullstack.login_register.services;

import com.lucas.fullstack.login_register.model.User;
import com.lucas.fullstack.login_register.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServices {

    @Autowired
    private UserRepository repository;

    public User addUser(User user){
        user.setId(UUID.randomUUID().toString().split("-")[0]);
        return repository.save(user);
    }

    public List<User> listAll(){
        return repository.findAll();
    }
    public User listBydId(String id){
        return repository.findById(id).get();
    }
}
