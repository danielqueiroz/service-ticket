package com.st.ticketsgenerator.storemanagement.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties("rabbit")
@Configuration
@Data
public class RabbitConfigProperties {
    private String exchangeName;
    private String queueName;
}
