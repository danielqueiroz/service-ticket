package com.st.ticketsgenerator.domain.repository;

import com.st.ticketsgenerator.domain.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
