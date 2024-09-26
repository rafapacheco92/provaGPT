package com.example.prova.services;

import com.example.prova.entities.TarefaEntity;
import com.example.prova.repositories.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaService {

    @Autowired
    TarefaRepository tarefaRepository;

    public List<TarefaEntity> listarTodos() {
        return tarefaRepository.findAll();
    }

    public TarefaEntity salvar(TarefaEntity tarefa) {
        return tarefaRepository.save(tarefa);
    }
}