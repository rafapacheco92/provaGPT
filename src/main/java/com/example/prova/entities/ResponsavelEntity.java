package com.example.prova.entities;

import jakarta.persistence.*;

@Entity
public class ResponsavelEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @OneToOne
    @JoinColumn(name = "tarefa_id")
    private TarefaEntity tarefa;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public TarefaEntity getTarefa() {
        return tarefa;
    }

    public void setTarefa(TarefaEntity tarefa) {
        this.tarefa = tarefa;
    }
}