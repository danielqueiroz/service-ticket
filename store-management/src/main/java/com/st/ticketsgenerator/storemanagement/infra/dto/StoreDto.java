package com.st.ticketsgenerator.storemanagement.infra.dto;

import lombok.Data;

import java.util.List;

@Data
public class StoreDto {

    private Long id;
    private String name;
    private String clientId;
    private List<ServiceDeskDto> serviceDesks;
}