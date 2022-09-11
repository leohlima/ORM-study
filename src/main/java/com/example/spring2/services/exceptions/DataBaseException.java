package com.example.spring2.services.exceptions;

public class DataBaseException extends RuntimeException{
    public DataBaseException(String message) {
        super(message);
    }
}
