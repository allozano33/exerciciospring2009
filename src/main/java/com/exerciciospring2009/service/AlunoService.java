package com.exerciciospring2009.service;

import com.exerciciospring2009.model.Aluno;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlunoService {

    List<Aluno> alunoList = new ArrayList<>();

    public Aluno cadastra(Aluno aluno) {
        alunoList.add(aluno);
        aluno.setId(alunoList.size());
        return aluno;
    }

    public List<Aluno> listar(){
        return alunoList;
    }

    public Aluno buscarAluno (String nome) {
        for (Aluno aluno : alunoList) {
            if (aluno.getNome().equalsIgnoreCase(nome)){
                return aluno;
            }
        }
        return null;
    }

    public void remove (Integer id) {
        for (Aluno aluno : alunoList) {
            if (aluno.getId().equals(id)) {
                alunoList.remove(aluno);
            }
        }
    }

    public void atualizar (Aluno aluno) {
        for (int i = 0; i< alunoList.size();i++){
            if (alunoList.get(i).getId().equals(aluno.getId())) {
                alunoList.set(i,aluno);
            }
        }
    }
}
