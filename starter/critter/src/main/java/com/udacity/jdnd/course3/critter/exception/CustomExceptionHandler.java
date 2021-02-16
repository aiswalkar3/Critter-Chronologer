package com.udacity.jdnd.course3.critter.Exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandler {
    @ExceptionHandler()
    public ResponseEntity<Exception> handleException(Exception e)
    {
        HttpHeaders headers = new HttpHeaders();

        if(e instanceof )
        {

        }
        else
        {
            HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;

        }
    }

}
