package com.st.ticketsgenerator.infra.rest.dtos;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class StoreDto {
    @NotNull
    private Integer id;
    @NotNull
    private String name;

    @Override
    public String toString() {
        return "StoreDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
