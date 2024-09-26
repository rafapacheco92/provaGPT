package com.example.prova.controllers;

import com.example.prova.dto.TarefaDTO;
import com.example.prova.services.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private TarefaService tarefaService;

    @GetMapping("/tarefa")
    public ResponseEntity<List<TarefaDTO>> listarTodos() {
        List<TarefaDTO> tarefas = tarefaService.listarTodos();
        return ResponseEntity.ok(tarefas);
    }

    @PostMapping("/tarefa")
    public ResponseEntity<TarefaDTO> criar(@RequestBody TarefaDTO tarefaDTO) {
        TarefaDTO novaTarefa = tarefaService.salvar(tarefaDTO);
        return ResponseEntity.ok(novaTarefa);
    }
}
