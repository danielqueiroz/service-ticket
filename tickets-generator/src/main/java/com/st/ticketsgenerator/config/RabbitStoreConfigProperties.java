package com.st.ticketsgenerator.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties("rabbit.store-management")
@Configuration
@Data
public class RabbitStoreConfigProperties {
    private String exchangeName;
    private String queueName;
}
