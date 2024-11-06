package com.st.ticketsgenerator.infra.rest.dtos;

import lombok.Data;

@Data
public class ExceptionDto {

    private String message;
    private Exception detailedException;

    public ExceptionDto(String message, Exception ex) {
        this.message = message;
        this.detailedException = ex;
    }
}
