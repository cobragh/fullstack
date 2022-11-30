package com.lucas.fullstack.login_register.model;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;

@Document(collection = "Login")
public class LoginModel {
//    @NotNull(message = "Por favor, digite seu usuário.")
//    private String username;
//    @NotNull(message = "Por favor, digite sua senha.")
//    private String password;
//
//    public LoginModel(String username, String password) {
//        this.username = username;
//        this.password = password;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public String getPassword() {
//        return password;
//    }
}
