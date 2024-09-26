package com.example.prova.entities;

import jakarta.persistence.*;

@Entity
public class UsersEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @ManyToOne
    @JoinColumn(name = "tarefa_id")
    private TarefaEntity tarefa;

    public long getId() {
        return id;
    }

    public void setId(long id) {
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