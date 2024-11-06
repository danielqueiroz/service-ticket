package com.st.ticketsgenerator.infra.rest.dtos;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ServiceDto {
    @NotNull
    private Long id;
    @NotNull
    private String name;

    private ServiceDto parent;

    private List<ServiceDto> children;

    private Long storeId;

    private Boolean leaf;
}
