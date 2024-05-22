package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(
        name = "pessoa"
)
public class Pessoa {
    @Id
    @Column(
            name = "pessoa_id"
    )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(
            name = "nome",
            length = 255,
            nullable = false
    )
    private String nome;

    @Column(
            name = "idade",
            nullable = false,
            length = 50
    )
    private int idade;

    @Column(
            name = "fone",
            nullable = false,
            length = 50
    )
    private String tell;

    @Column(
            name = "email",
            nullable = false,
            length = 255
    )
    private String email;

    @Column(
            name = "cpf",
            nullable = false,
            length = 50
    )
    private int cpf;
    @Column(
            name = "endereco",
            nullable = true,
            length = 255
    )
    private String endereco;
    @Column(
            name = "numere_casa",
            nullable = true,
            length = 50
    )
    private int enderecoNum;

    @Column(
            name = "cep",
            nullable = false,
            length = 100
    )
    private int cep;


    public Pessoa() {
    }

    public Pessoa(Long id, String nome, int idade, String tell, String email, int cpf, String endereco, int enderecoNum, int cep) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.tell = tell;
        this.email = email;
        this.cpf = cpf;
        this.endereco = endereco;
        this.enderecoNum = enderecoNum;
        this.cep = cep;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTell() {
        return tell;
    }

    public void setTell(String tell) {
        this.tell = tell;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getEnderecoNum() {
        return enderecoNum;
    }

    public void setEnderecoNum(int enderecoNum) {
        this.enderecoNum = enderecoNum;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }
}
