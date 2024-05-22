package com.example.demo.service;

import com.example.demo.model.Pessoa;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PessoaService {
    public List<Pessoa> findAll();
    public Pessoa findById(Long id);
    public Pessoa salvar(Pessoa pessoa);
    public void update(Long id, Pessoa newPessoa);
    public void deletar(Long id);

}
