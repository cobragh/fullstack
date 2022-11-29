package com.lucas.fullstack.login_register.services;

public class LoginService {
    private String username;
    private String password;

    public LoginService(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
