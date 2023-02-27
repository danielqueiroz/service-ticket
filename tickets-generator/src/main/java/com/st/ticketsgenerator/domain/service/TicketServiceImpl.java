package com.st.ticketsgenerator.domain.service;

import com.st.ticketsgenerator.domain.Ticket;
import com.st.ticketsgenerator.domain.repository.TicketRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TicketServiceImpl implements TicketService {

    private TicketRepository ticketRepository;
    private SequenceGenerator sequenceGenerator;

    @Override
    public Ticket save(Ticket ticket) {
        ticket.setTicketNumber(String.format("%d",sequenceGenerator.getNext()));
        return ticketRepository.save(ticket);
    }
}
