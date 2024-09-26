package com.example.prova.entities;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class TarefaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "titulo")
    private String titulo;

    @OneToOne(mappedBy = "tarefa", cascade = CascadeType.ALL)
    private ResponsavelEntity responsavel;

    @OneToMany(mappedBy = "tarefa", cascade = CascadeType.ALL)
    private List<UsersEntity> users;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ResponsavelEntity getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(ResponsavelEntity responsavel) {
        this.responsavel = responsavel;
    }

    public List<UsersEntity> getUsers() {
        return users;
    }

    public void setUsers(List<UsersEntity> users) {
        this.users = users;
    }
}