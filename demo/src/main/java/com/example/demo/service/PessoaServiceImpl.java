package com.example.demo.service;

import com.example.demo.model.Pessoa;
import com.example.demo.repository.PessoaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class PessoaServiceImpl implements PessoaService {


    @Autowired
    private PessoaRepository pessoaRepository;

    @Override
    public List<Pessoa> findAll() {
    return pessoaRepository.findAll();
    }

    @Override
    public Pessoa findById(Long id) {
       return  pessoaRepository.findById(id).orElse(null);
    }

    @Override
    public Pessoa salvar(Pessoa pessoa) {
      return   pessoaRepository.save(pessoa);
    }

    @Override
    public void update(Long id, Pessoa newPessoa) {
        Pessoa pessoa = findById(id);

        pessoa.setNome(newPessoa.getNome());
        pessoa.setCep(newPessoa.getCep());
        pessoa.setEndereco(newPessoa.getEndereco());
        pessoa.setIdade(newPessoa.getIdade());
        pessoa.setEmail(newPessoa.getEmail());
        pessoa.setEnderecoNum(newPessoa.getEnderecoNum());
        pessoa.setTell(newPessoa.getTell());
        pessoaRepository.flush();

    }

    @Override
    public void deletar(Long id) {
        Pessoa pessoa = findById(id);
        pessoaRepository.delete(pessoa);
    }
}
