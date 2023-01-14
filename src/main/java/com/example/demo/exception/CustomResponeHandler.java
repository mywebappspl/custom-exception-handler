package com.example.demo.exception;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Order(Ordered.HIGHEST_PRECEDENCE)
@ControllerAdvice
public class CustomResponeHandler {
    private static final Logger logger = LoggerFactory.getLogger(CustomResponeHandler.class);
    @ExceptionHandler(value = CustomExceptionHandler.class)
    public ResponseEntity<ErrorMsg> CompanyException(CustomExceptionHandler e) {
        return ResponseEntity.status(e.getStatus()).body(new ErrorMsg(e.getException()));
    }
}
