package com.st.ticketsgenerator.storemanagement.infra.dto;

import lombok.Data;

@Data
public class ServiceDeskDto {

    private Long id;
    private String name;
    private StoreDto store;
}
