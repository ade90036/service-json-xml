package com.mastercard.api.controller;

import com.mastercard.api.model.Error;
import org.springframework.boot.autoconfigure.web.BasicErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.web.HttpMediaTypeException;
import org.springframework.web.servlet.NoHandlerFoundException;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Created by andrearizzini on 04/07/2017.
 */

@RestControllerAdvice
public class ErrorController {

    @ExceptionHandler(RuntimeException.class)
    @ResponseStatus(value= HttpStatus.INTERNAL_SERVER_ERROR)
    public Error handleRuntimeException(RuntimeException ex) {
        Error responseMsg = new Error("failed", "500", ex.getMessage());
        return responseMsg;
    }

    @ExceptionHandler(HttpMediaTypeException.class)
    @ResponseStatus(value= HttpStatus.UNSUPPORTED_MEDIA_TYPE)
    public Error handleMediaTypeException(HttpMediaTypeException ex) {
        Error responseMsg = new Error("failed", "405", ex.getMessage());
        return responseMsg;
    }

    @ExceptionHandler()
    @ResponseStatus(value= HttpStatus.NOT_FOUND)
    public Error handleNotFound(NoHandlerFoundException ex) {
        Error responseMsg = new Error("failed", "404", ex.getMessage());
        return responseMsg;
    }
}
