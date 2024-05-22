package com.example.demo.service;

import com.example.demo.model.Ponto;
import com.example.demo.repository.PontoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class PontoServiceImpl implements PontoService {

    @Autowired
    private PontoRepository pontoRepository;

    @Override
    public Ponto findById(Long id) {
     return    pontoRepository.findById(id).orElse(null);
    }

    @Override
    public List<Ponto> findAll() {
        return pontoRepository.findAll();
    }

    @Override
    public Ponto registerPonto(Ponto ponto) {
        pontoRepository.save(ponto);
        return ponto;
    }





}
