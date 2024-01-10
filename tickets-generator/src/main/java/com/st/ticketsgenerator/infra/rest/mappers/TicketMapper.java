package com.st.ticketsgenerator.infra.rest.mappers;

import com.st.ticketsgenerator.domain.Ticket;
import com.st.ticketsgenerator.infra.rest.dtos.TicketDto;


public interface TicketMapper {

    Ticket ticketDtoToTicket(TicketDto ticketDto);
}
