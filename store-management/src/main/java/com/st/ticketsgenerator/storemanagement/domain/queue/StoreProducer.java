package com.st.ticketsgenerator.storemanagement.domain.queue;

import com.st.ticketsgenerator.storemanagement.config.RabbitConfigProperties;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class StoreProducer {
    private final RabbitTemplate rabbitTemplate;
    private final RabbitConfigProperties rabbitConfigProperties;

    public void sendToQueue(StoreOperation storeOperation) {
        log.info("Store is going to be added into the queue: {} ", storeOperation);
        rabbitTemplate.convertAndSend(rabbitConfigProperties.getExchangeName(), rabbitConfigProperties.getQueueName(), storeOperation);
    }
}
