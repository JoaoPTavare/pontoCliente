package com.example.demo.service;

import com.example.demo.model.Funcionario;
import com.example.demo.repository.FuncionarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class FuncionarioServiceImpl implements FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @Override
    public List<Funcionario> findAll() {
        return funcionarioRepository.findAll();
    }

    @Override
    public Funcionario findById(Long id) {
        return funcionarioRepository.findById(id).orElse(null);
    }

    @Override
    public Funcionario salvar(Funcionario funcionario) {
        return  funcionarioRepository.save(funcionario);

    }

    @Override
    public void delete(Long id) {
        Funcionario funcionario = findById(id);
        funcionarioRepository.delete(funcionario);
    }

    @Override
    public void upDate(Long id, Funcionario newFuncionario) {
        Funcionario funcionario = findById(id);


        funcionario.setNome(newFuncionario.getNome());
        funcionario.setEmail(newFuncionario.getEmail());
        funcionario.setIdade(newFuncionario.getIdade());
        funcionario.setCpf(newFuncionario.getCpf());
        funcionario.setTell(newFuncionario.getTell());
        funcionario.setEndereco(newFuncionario.getEndereco());
        funcionario.setEnderecoNum(newFuncionario.getEnderecoNum());
    }
}
