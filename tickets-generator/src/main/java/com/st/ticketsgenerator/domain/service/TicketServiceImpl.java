package com.st.ticketsgenerator.domain.service;

import com.st.ticketsgenerator.domain.Ticket;
import com.st.ticketsgenerator.domain.queues.TicketProducer;
import com.st.ticketsgenerator.domain.repository.TicketRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TicketServiceImpl implements TicketService {

    private TicketRepository ticketRepository;
    private SequenceGenerator sequenceGenerator;

    private TicketProducer ticketProducer;

    @Override
    public Ticket save(Ticket ticket) {
        ticket.setTicketNumber(String.format("%d",sequenceGenerator.getNext()));
        Ticket savedTicket = ticketRepository.save(ticket);
        ticketProducer.sendToQueue(savedTicket);
        return savedTicket;
    }
}
