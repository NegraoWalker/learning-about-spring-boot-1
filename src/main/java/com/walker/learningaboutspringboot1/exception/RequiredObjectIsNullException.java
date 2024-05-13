package com.walker.learningaboutspringboot1.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST) //EXCEÇÕES LANÇADAS QUANDO O OBJETO VEM NULL - PARA TESTES UNITÁRIOS
public class RequiredObjectIsNullException extends RuntimeException {
    public RequiredObjectIsNullException() {
        super("It is not allowed to persist a null object!");
    }

    public RequiredObjectIsNullException(String ex) {
        super(ex);
    }
}
