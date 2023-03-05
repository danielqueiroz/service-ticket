package com.st.ticketsgenerator.domain.queues;

import com.st.ticketsgenerator.domain.Ticket;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class TicketProducer {

    private final RabbitTemplate rabbitTemplate;

    public void sendToQueue(Ticket ticket) {
        log.info("Generated ticket is going to be added into the queue: {} ", ticket);
        rabbitTemplate.convertAndSend("amq.direct", "app.tickets.generated", ticket);
    }
}
