package com.st.ticketsgenerator.infra.rest.dtos;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class TicketDto {

    @NotNull
    private StoreDto store;
    @NotNull
    private String clientPhoneNumber;
    @NotNull
    private ServiceDto service;

}
