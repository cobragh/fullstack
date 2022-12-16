package com.lucas.fullstack.login_register.model;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
@Document(collection = "REGISTER")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CadastroDTO {
    private String username;
    private String senha;
    private String email;
}
