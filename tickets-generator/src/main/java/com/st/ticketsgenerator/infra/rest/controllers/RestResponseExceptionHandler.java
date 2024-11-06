package com.st.ticketsgenerator.infra.rest.controllers;

import com.st.ticketsgenerator.infra.rest.dtos.ExceptionDto;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestResponseExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value
            = { EntityNotFoundException.class })
    protected ResponseEntity<Object> handleEntityNotFound(
            RuntimeException ex, WebRequest request) {
        ExceptionDto exceptionDto = new ExceptionDto("The requested entity does not exist", ex);

        return handleExceptionInternal(ex, exceptionDto,
                new HttpHeaders(), HttpStatus.NOT_FOUND, request);
    }

}
