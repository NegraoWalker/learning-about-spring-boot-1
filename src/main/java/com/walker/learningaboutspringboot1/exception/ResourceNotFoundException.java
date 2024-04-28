package com.walker.learningaboutspringboot1.exception;

public class ResourceNotFoundException extends RuntimeException { //EXCEÇÃO DE RECURSO NÃO ENCONTRADO(EXCEÇÃO PERSONALIZADA)
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
