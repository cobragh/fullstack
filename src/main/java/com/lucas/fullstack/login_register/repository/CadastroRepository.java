package com.lucas.fullstack.login_register.repository;

import com.lucas.fullstack.login_register.model.CadastroDTO;
import com.lucas.fullstack.login_register.model.CadastroModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CadastroRepository extends MongoRepository<CadastroDTO, String> {

    Optional<CadastroDTO> findByUsername(String username);
    Optional<CadastroDTO> findByEmail(String email);
//    Optional<CadastroModel> typeSenha(String senha);
//    Optional<CadastroModel> confirmSenha(String confirmSenha);

    }
