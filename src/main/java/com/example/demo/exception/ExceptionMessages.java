package com.example.demo.exception;
public enum ExceptionMessages {
    COMPANY_NOT_EXIST ("Company not exist"),
    USER_NOT_EXIST ("User not exist");
    private final String message;

    ExceptionMessages(final String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
