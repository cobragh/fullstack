package com.lucas.fullstack.login_register.model;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Document(collection = "REGISTER")
public class CadastroModel {

    private String idCadastro;
    @NotBlank(message = "Digite um usuário.")
    private String username;
    @NotBlank(message = "Digite uma senha.")
    private String senha;
    @NotBlank(message = "Confirme sua senha.")
    private String confirmSenha;
    @NotBlank(message = "Digite um e-mail válido.")
    private String email;

    public CadastroModel(String username, String senha, String email) {
        this.username = username;
        this.senha = senha;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
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

    public String getConfirmSenha() {
        return confirmSenha;
    }

    public void setConfirmSenha(String confirmSenha) {
        this.confirmSenha = confirmSenha;
    }
}
