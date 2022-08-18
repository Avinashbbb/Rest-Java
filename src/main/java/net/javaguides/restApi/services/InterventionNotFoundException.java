package net.javaguides.restApi.services;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.rmi.StubNotFoundException;

@Getter
@Setter
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class InterventionNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    private String message;
    public InterventionNotFoundException(String message){
        this.message = message;
    }
}
