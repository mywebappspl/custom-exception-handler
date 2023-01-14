package com.example.demo.exception;

import lombok.Getter;
import lombok.Setter;


public class ErrorMsg {
    private String message;
    public ErrorMsg(String message)
    {
        this.message=message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }
}
