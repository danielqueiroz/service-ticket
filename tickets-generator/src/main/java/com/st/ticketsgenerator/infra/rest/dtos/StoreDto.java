package com.st.ticketsgenerator.infra.rest.dtos;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class StoreDto {
    @NotNull
    private Integer id;
    @NotNull
    private String name;
}