package com.st.ticketsgenerator.domain.queues.dto;

import com.st.ticketsgenerator.infra.rest.dtos.StoreDto;
import lombok.Data;

@Data
public class StoreOperation {
    private StoreDto store;
    private String operation;

    @Override
    public String toString() {
        return "StoreOperation{" +
                "store=" + store +
                ", operation='" + operation + '\'' +
                '}';
    }
}
