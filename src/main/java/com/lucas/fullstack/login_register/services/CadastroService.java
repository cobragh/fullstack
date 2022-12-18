package com.lucas.fullstack.login_register.services;

import com.lucas.fullstack.login_register.dto.CadastroDTO;
import com.lucas.fullstack.login_register.model.CadastroModel;
import com.lucas.fullstack.login_register.repository.CadastroRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class CadastroService {

    private BCryptPasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
    @Autowired
    CadastroRepository repository;



    public void addCadastro(CadastroModel cadastro) throws Exception {
        if (repository.findByUsername(cadastro.getUsername()).isPresent()) {
            throw new Exception("User already used!");
        } else if(repository.findByEmail(cadastro.getEmail()).isPresent()){
            throw new Exception("Email already used.");
        } else if(!Objects.equals(cadastro.getSenha(), cadastro.getConfirmSenha())){
            throw new Exception("Password doesn't match!");
        }
        else {
            cadastro.setIdCadastro(UUID.randomUUID().toString().split("-")[0]);
            cadastro.setSenha(passwordEncoder().encode(cadastro.getSenha()));
            repository.save(cadastro);
        }
    }
    public List<CadastroDTO> listRegister() throws Exception{
        List<CadastroModel> cadastroModels = repository.findAll();
        if (cadastroModels.isEmpty()) {
            throw new Exception("Sem dados!");
        }
        return new ArrayList<>(cadastroModels
                .stream()
                .map(prod -> new ModelMapper()
                        .map(prod, CadastroDTO.class))
                .collect(Collectors.toList()));
    }

//    public CadastroModel listById(String id) throws Exception{
//        if(!repository.existsById(cadModelo.getIdCadastro())) {
//            throw new Exception("as");
//        }else{
//            return repository.findById(id).get();
//        }
//    }
//    public void deleteById(String id){
//        repository.deleteById(id);
//    }
}
