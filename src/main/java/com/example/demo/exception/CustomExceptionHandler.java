package com.example.demo.exception;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;


public class CustomExceptionHandler extends Exception{
    private String exception;
    private HttpStatus status;
    public CustomExceptionHandler(ExceptionMessages exceptionMessages, HttpStatus status)
    {
        this.exception = exceptionMessages.getMessage();
        this.status = status;
    }

    public void setException(final String exception) {
        this.exception = exception;
    }

    public void setStatus(final HttpStatus status) {
        this.status = status;
    }

    public String getException() {
        return exception;
    }

    public HttpStatus getStatus() {
        return status;
    }
}
