package com.example.demo.service;

import com.example.demo.model.Ponto;


import org.springframework.stereotype.Service;

import java.util.List;



@Service
public interface PontoService {

    public Ponto findById(Long id);
    public List<Ponto> findAll();
    public Ponto registerPonto(Ponto ponto);



}
