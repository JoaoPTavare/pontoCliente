package com.example.demo.service;

import com.example.demo.model.Funcionario;


import java.util.List;


public interface FuncionarioService {
    public List<Funcionario> findAll();
    public Funcionario findById(Long id);
    public Funcionario salvar(Funcionario funcionario);
    public void delete(Long id);
    public void upDate(Long id, Funcionario newFuncionario);

}
