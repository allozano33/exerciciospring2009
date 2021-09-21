package com.exerciciospring2009.controller;

import com.exerciciospring2009.model.Aluno;
import com.exerciciospring2009.model.Disciplina;
import com.exerciciospring2009.service.AlunoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @PostMapping("/cadastra")
    public Aluno cadastra(@RequestBody Aluno aluno) {
        alunoService.cadastra(aluno);
        return aluno;

    }

    @GetMapping("/lista")
    public List<Aluno> listaAluno(){
        return alunoService.listar();
    }

    @GetMapping("/{nome}")
    public Aluno obtemAluno(@PathVariable String nome){
        return alunoService.buscarAluno(nome);

    }

    @DeleteMapping(value ="/deleta/{id}")
    public String remover(@PathVariable("id") Integer id) {
        alunoService.remove(id);
        return "deletado";
    }

    @PutMapping(value = "/atualiza")
    public void atualizar(@RequestBody Aluno payload) {
        alunoService.atualizar(payload);
    }
}






