package com.walker.learningaboutspringboot1.ExamplesAPIS.Exceptions;

import java.io.Serializable;
import java.util.Date;

//Função da classe: Ser enviada como resposta ao cliente quando gerar uma exceção
public class ExceptionResponse implements Serializable {
    //Fields:
    private Date timestamp;
    private String  message;
    private String details;

    //Constructors:
    public ExceptionResponse() {
    }

    public ExceptionResponse(Date timestamp, String message, String details) {
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }

    //Getters and Setters:
    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
