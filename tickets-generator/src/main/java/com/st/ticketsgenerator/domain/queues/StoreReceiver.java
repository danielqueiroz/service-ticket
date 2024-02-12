package com.st.ticketsgenerator.domain.queues;

import com.st.ticketsgenerator.config.RabbitStoreConfigProperties;
import com.st.ticketsgenerator.domain.queues.dto.StoreOperation;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@AllArgsConstructor
public class StoreReceiver {
    private RabbitStoreConfigProperties rabbitStoreConfigProperties;

    @RabbitListener(queues = {"q.app-tickets-generator.store-management"})
    public void receive(StoreOperation storeOperation) {
        log.info("Received store operation {}", storeOperation);
    }
}
