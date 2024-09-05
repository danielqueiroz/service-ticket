package com.st.ticketsgenerator.infra.rest.dtos;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ClientDto {
    @NotNull
    private String phoneNumber;
    @NotNull
    private String name;
    @NotNull
    private String cpf;
}
