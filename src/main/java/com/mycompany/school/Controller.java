package com.mycompany.school;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @PostMapping("/alunos")
    Aluno aluno(@RequestBody Aluno aluno){
        Aluno newAlun = new Aluno("Matheus", 22, "6");

        try {
            newAlun.setNome(aluno.getNome());
            newAlun.setIdade(aluno.getIdade());
            newAlun.setSala(aluno.getSala());
            return newAlun;
        }catch (AlunoException e) {
            throw new AlunoException("Error ao tentar converter idade" + e);
        }
    }
}
