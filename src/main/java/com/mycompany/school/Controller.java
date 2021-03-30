package com.mycompany.school;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @PostMapping("/alunos")
    String aluno(@RequestBody Aluno aluno){
        Aluno novoAluno = new Aluno();

        novoAluno.setNome(aluno.getNome());
        if(aluno.getIdade() >= 10 && aluno.getSala() == "5") {
            return "Aluno muito velho!";
        }
        try {
            return "Parabéns o " + novoAluno.getNome() + " está cadastrado!";
        }catch (AlunoException e) {
            throw new AlunoException("Error ao tentar converter idade" + e);
        }
    }
    @GetMapping("/sala/{id}")
    ResponseEntity listarAluno(@PathVariable String id){
        return new ResponseEntity<String>("GET Response : "
                + id, HttpStatus.OK);
    }
}
