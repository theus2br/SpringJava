package com.mycompany.school;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AlunoException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public AlunoException(){}
    public AlunoException(String errorMessage, Throwable err){
        super(errorMessage, err);
    }

    public AlunoException(String errorMessage) {
        super(errorMessage);
    }
}
