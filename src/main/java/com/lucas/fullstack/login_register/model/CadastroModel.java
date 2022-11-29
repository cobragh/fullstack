package com.lucas.fullstack.login_register.model;

import org.springframework.data.mongodb.core.mapping.Document;
import javax.validation.constraints.NotNull;

@Document(collection = "REGISTER")
public class CadastroModel {

    @NotNull
    private String idCadastro;
    @NotNull
    private String username;
    @NotNull
    private String senha;
    @NotNull
    private String email;

    public CadastroModel(String username, String senha, String email) {
        this.username = username;
        this.senha = senha;
        this.email = email;
    }

    public String getName() {
        return username;
    }

    public void setName(String username) {
        this.username = username;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdCadastro() {
        return idCadastro;
    }

    public void setIdCadastro(String idCadastro) {
        this.idCadastro = idCadastro;
    }
}
