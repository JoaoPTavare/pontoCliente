package com.example.demo.model;


import jakarta.persistence.*;

import javax.xml.crypto.Data;
import java.time.LocalDateTime;

@Entity
@Table(name = "tabela_pontos_funcionarios")
public class Ponto {
    @Id
    @Column(name = "ponto_funcionario_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToOne
    private Funcionario funcionario;

    @Column(name = "endereço",
    nullable = false,
    length = 255)
    private String localizacao;


    @Column(name = "horario_do_ponto")
    private LocalDateTime data;








    public Ponto() {
    }

    public Ponto(Long id, Funcionario funcionario, String localizacao, LocalDateTime data) {
        this.id = id;
        this.funcionario = funcionario;
        this.localizacao = localizacao;
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = LocalDateTime.now();
    }
}
