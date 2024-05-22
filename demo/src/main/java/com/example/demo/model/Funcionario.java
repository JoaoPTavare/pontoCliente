package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(
        name = "funcionarios"
)
public class Funcionario extends Pessoa{
    @Id
    @Column(name = "funcionario_id")
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;


    @OneToOne(cascade = CascadeType.ALL)
    private Pessoa pessoa;


    public Funcionario() {
    }

    public Funcionario(Long id, Pessoa pessoa) {
        this.id = id;
        this.pessoa = pessoa;
    }

    public Funcionario(Long id, String nome, int idade, String tell, String email, int cpf, String endereco, int enderecoNum, int cep, Long id1, Pessoa pessoa) {
        super(id, nome, idade, tell, email, cpf, endereco, enderecoNum, cep);
        this.id = id1;
        this.pessoa = pessoa;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
