package com.lucas.fullstack.login_register.controller;

import com.lucas.fullstack.login_register.model.CadastroModel;
import com.lucas.fullstack.login_register.services.CadastroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/register")
public class CadastroController {

    @Autowired
    CadastroService service;

    @PostMapping
    public void addUser(@RequestBody CadastroModel model) throws Exception {
        service.addCadastro(model);
    }

    @GetMapping
    public List<CadastroModel> listAll() throws Exception {
        return service.listRegister();
    }

}
