package com.walker.learningaboutspringboot1.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@ControllerAdvice
@RestController
public class CustomizedResponseEntityExceptionHandler { //MANIPULADOR DE EXCEÇÃO DE ENTIDADE DE RESPOSTA PERSONALIZADO
    @ExceptionHandler(Exception.class)
    public final ResponseEntity<ExceptionResponse> handleAllExceptions(Exception exception, WebRequest request){ //LIDAR COM TODAS AS EXCEÇÕES
        ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), exception.getMessage(), request.getDescription(false));
        return new ResponseEntity<>(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    public final ResponseEntity<ExceptionResponse> handleNotFoundExceptions(Exception exception, WebRequest request){ //LIDAR COM EXCEÇÕES NÃO ENCONTRADAS
        ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), exception.getMessage(), request.getDescription(false));
        return new ResponseEntity<>(exceptionResponse, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(RequiredObjectIsNullException.class) //TRATANDO EXCEÇÕES COM OBJETOS NULL - TESTES UNITÁRIOS
    public final ResponseEntity<ExceptionResponse> handleBadRequestExceptions(
            Exception ex, WebRequest request) {

        ExceptionResponse exceptionResponse = new ExceptionResponse(
                new Date(),
                ex.getMessage(),
                request.getDescription(false));

        return new ResponseEntity<>(exceptionResponse, HttpStatus.BAD_REQUEST);
    }
}
