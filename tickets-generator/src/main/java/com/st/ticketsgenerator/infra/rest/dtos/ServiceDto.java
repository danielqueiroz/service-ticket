package com.st.ticketsgenerator.infra.rest.dtos;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ServiceDto {
    @NotNull
    private Integer id;
    @NotNull
    private String name;
}
