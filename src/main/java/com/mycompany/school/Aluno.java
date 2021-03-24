package com.mycompany.school;

import lombok.Data;
import org.jetbrains.annotations.NotNull;

@Data
public class Aluno {

    @NotNull
    String nome;

    @NotNull
    Integer idade;

    @NotNull
    String sala;

}
