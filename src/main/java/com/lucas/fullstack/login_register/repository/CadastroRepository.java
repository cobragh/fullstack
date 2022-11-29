package com.lucas.fullstack.login_register.repository;

import com.lucas.fullstack.login_register.model.CadastroModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CadastroRepository extends MongoRepository<CadastroModel, String> {

    Optional<CadastroModel> findByUsername(String username);
    Optional<CadastroModel> findByEmail(String email);
    }
