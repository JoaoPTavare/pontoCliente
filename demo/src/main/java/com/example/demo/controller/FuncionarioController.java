package com.example.demo.controller;

import com.example.demo.model.Funcionario;
import com.example.demo.repository.FuncionarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
@RequestMapping("/apiFuncionario")
public class FuncionarioController {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @GetMapping
    public ResponseEntity<List<Funcionario>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(funcionarioRepository.findAll());
    }

    @GetMapping("funcionario/{id}")
    public ResponseEntity<Funcionario> findById(Long id){
    Funcionario trasFuncionario = findById(id).getBody();

    return ResponseEntity.status(HttpStatus.OK).body(trasFuncionario);

    }

    @PostMapping
    public ResponseEntity<Funcionario> salvar(Funcionario funcionario){
        return ResponseEntity.status(HttpStatus.CREATED).body(funcionarioRepository.save(funcionario));
    }

    @PutMapping
    public ResponseEntity<Funcionario> upDate(Long id, Funcionario funcionario){
        Funcionario atulizaFuncionario = upDate(id, funcionario).getBody();
        return ResponseEntity.status(HttpStatus.OK).body(atulizaFuncionario);

    }


    @DeleteMapping("funcionario/{id}")
    public ResponseEntity<Funcionario> delete(Long id){
        Funcionario deletarFuncionario = delete(id).getBody();
        return ResponseEntity.ok().body(deletarFuncionario);
    }



}

