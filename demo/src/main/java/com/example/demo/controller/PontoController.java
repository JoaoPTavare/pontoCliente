package com.example.demo.controller;


import com.example.demo.model.Ponto;
import com.example.demo.service.PontoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
@RequestMapping("/apiPonto")
public class PontoController
{

    @Autowired
    private PontoService pontoService;




    @GetMapping("ponto/{id}")
    public ResponseEntity<Ponto> findById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(pontoService.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<Ponto>> findAll(){
    return ResponseEntity.status(HttpStatus.OK).body(pontoService.findAll());
}

    @PostMapping
    public ResponseEntity<Ponto> registerPonto(Ponto ponto){
        Ponto salvaPonto = pontoService.registerPonto(ponto);
        return ResponseEntity.ok().body(salvaPonto);
    }


}
