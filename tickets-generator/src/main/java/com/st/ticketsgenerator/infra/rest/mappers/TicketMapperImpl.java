package com.st.ticketsgenerator.infra.rest.mappers;

import com.st.ticketsgenerator.domain.Ticket;
import com.st.ticketsgenerator.infra.rest.dtos.TicketDto;
import org.springframework.stereotype.Component;

@Component
public class TicketMapperImpl implements TicketMapper {
    @Override
    public Ticket ticketDtoToTicket(TicketDto ticketDto) {
        if (ticketDto == null) {
            return null;
        }

        Ticket ticket = new Ticket();
        ticket.setStoreId(ticketDto.getStore().getId());
        ticket.setStoreName(ticketDto.getStore().getName());
        ticket.setServiceId(ticketDto.getService().getId());
        ticket.setServiceName(ticketDto.getService().getName());
        ticket.setClientPhoneNumber(ticketDto.getClientPhoneNumber());

        return ticket;
    }
}
