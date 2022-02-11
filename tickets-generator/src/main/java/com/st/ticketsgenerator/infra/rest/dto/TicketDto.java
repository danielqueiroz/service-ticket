package com.st.ticketsgenerator.infra.rest.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class TicketDto {

    private String store;
    private Integer number;
    private LocalDateTime generatedAt;

}
