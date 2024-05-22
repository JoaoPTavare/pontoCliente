package com.example.demo.controller;



import com.example.demo.model.Pessoa;
import com.example.demo.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
@RequestMapping("/apiPessoa")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @GetMapping
    public ResponseEntity<List<Pessoa>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(pessoaService.findAll());
    }

    @GetMapping("{id}")
    public ResponseEntity<Pessoa> findById(@PathVariable  Long id){
        return ResponseEntity.status(HttpStatus.OK).body(pessoaService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Pessoa> salvar(Pessoa pessoa){
        return ResponseEntity.status(HttpStatus.CREATED).body(pessoaService.salvar(pessoa));
    }

    @PutMapping
    public ResponseEntity<Pessoa> update(Long id, Pessoa pessoa){

        Pessoa t = update(id, pessoa).getBody();

        return ResponseEntity.status(HttpStatus.OK).body(t);
    }



    @DeleteMapping("pessoa/delete/{id}")
    public ResponseEntity<Pessoa> delete(Long id){
        Pessoa deletarFuncionario = pessoaService.findById(id);
        return ResponseEntity.ok().body(deletarFuncionario);
    }


}
