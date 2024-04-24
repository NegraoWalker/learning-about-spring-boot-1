package com.walker.learningaboutspringboot1.ExamplesAPIS.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//Função da classe: Exceção personalizada criada por mim
@ResponseStatus(HttpStatus.BAD_REQUEST) //BAD_REQUEST == status 400
public class UnsupportedMathOperationException extends RuntimeException{
    public UnsupportedMathOperationException(String message) {
        super(message);
    }
}
