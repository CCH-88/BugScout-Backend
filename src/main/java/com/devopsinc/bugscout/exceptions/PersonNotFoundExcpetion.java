package com.devopsinc.bugscout.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class PersonNotFoundExcpetion extends RuntimeException {
    public PersonNotFoundExcpetion(int id) {
        super("Person does not exist with that ID: " + id);
    }
}
