package com.example.lab.exception;

public class ClientNotFoundException extends RuntimeException {
    public ClientNotFoundException(Long id){
        super("Could not found the client with id "+ id);
    }
}

