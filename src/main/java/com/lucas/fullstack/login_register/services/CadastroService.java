package com.lucas.fullstack.login_register.services;

import com.lucas.fullstack.login_register.model.CadastroModel;
import com.lucas.fullstack.login_register.repository.CadastroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CadastroService {

    @Autowired
    CadastroRepository repository;

    public CadastroModel addCadastro(CadastroModel cadastro) throws Exception{
        if (repository.findByUsername(cadastro.getName()).isPresent()) {
            throw new Exception("User already used!");
        }
        cadastro.setIdCadastro(UUID.randomUUID().toString().split("-")[0]);
        return repository.save(cadastro);
    }

    CadastroModel cadModelo;

    public List<CadastroModel> listRegister() throws Exception{
        if(repository.findByEmail(cadModelo.getEmail()).isPresent()){
            throw new Exception("Email already used.");
        }
        return repository.findAll();
    }

    public CadastroModel listById(String id) throws Exception{
        if(!repository.existsById(cadModelo.getIdCadastro())) {
            throw new Exception("as");
        }else{
            return repository.findById(id).get();
        }
    }
    public void deleteById(String id){
        repository.deleteById(id);
    }
}
