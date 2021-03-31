package com.mycompany.school.Controller;

import com.mycompany.school.Models.Aluno;
import com.mycompany.school.Models.AlunoException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @PostMapping("/alunos")
    String aluno(@RequestBody Aluno aluno){
        Aluno novoAluno = new Aluno();

        novoAluno.setNome(aluno.getNome());
        if(aluno.getIdade() >= 18) {
            return "Nosso teste deu certo!";
        }
        try {
            return "Parabéns o " + novoAluno.getNome() + " está cadastrado!";
        }catch (AlunoException e) {
            throw new AlunoException("Error ao tentar converter idade" + e);
        }
    }
    @GetMapping("/sala/{id}")
    ResponseEntity listarAluno(@PathVariable Boolean id){
        return new ResponseEntity<String>("GET Response : "
                + id, HttpStatus.OK);
    }
}
