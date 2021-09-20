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
        return aluno;
    }

    public List<Aluno> listar(){
//        for (Aluno aluno: alunoList) {
//            return aluno;
//        }
        return alunoList;
    }
}
