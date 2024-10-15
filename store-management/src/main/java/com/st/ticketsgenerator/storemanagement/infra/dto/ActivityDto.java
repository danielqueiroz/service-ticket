package com.st.ticketsgenerator.storemanagement.infra.dto;

import lombok.Data;

@Data
public class ActivityDto {

    private Long id;
    private String description;
    private boolean generatesTicket;

}
