package com.edu.sinma.handler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.edu.sinma.model.ServiceDataWrapper;
import com.edu.sinma.model.ValidationException;

@ControllerAdvice  
@RestController
public class ErrorResponseHandler {

	@ResponseStatus(HttpStatus.BAD_REQUEST)  
    @ExceptionHandler(value = ValidationException.class)  
    public ServiceDataWrapper<?,?> handleBaseException(ValidationException e){  
        return e.getServiceDataWrapper();  
    }
}
