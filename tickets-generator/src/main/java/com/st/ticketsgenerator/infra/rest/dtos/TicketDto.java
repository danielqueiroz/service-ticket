package com.st.ticketsgenerator.infra.rest.dtos;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class TicketDto {

    @NotNull
    private StoreDto store;
    @NotNull
    private String clientPhoneNumber;
    @NotNull
    private ServiceDto service;

}
