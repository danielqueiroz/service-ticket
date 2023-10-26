package com.st.ticketsgenerator.config;

import jakarta.annotation.PostConstruct;
import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


@Component
public class RabbitConfig {

    private final AmqpAdmin amqpAdmin;
    private final RabbitConfigProperties rabbitConfigProperties;
    public RabbitConfig(AmqpAdmin amqpAdmin, RabbitConfigProperties rabbitConfigProperties) {
        this.amqpAdmin = amqpAdmin;
        this.rabbitConfigProperties = rabbitConfigProperties;
    }

    @Bean
    public MessageConverter converter() {
        return new Jackson2JsonMessageConverter();
    }

    @Bean
    public AmqpTemplate amqpTemplate(ConnectionFactory connectionFactory) {
        RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
        rabbitTemplate.setMessageConverter(converter());
        return rabbitTemplate;
    }

    private Queue queue() {
        return new Queue(rabbitConfigProperties.getQueueName(), true, false, false);
    }

    private DirectExchange directExchange() {
        return new DirectExchange(rabbitConfigProperties.getExchangeName());
    }

    private Binding bindingQueue(Queue queue, DirectExchange directExchange) {
        return new Binding(queue.getName(), Binding.DestinationType.QUEUE, directExchange.getName(),
                queue.getName(), null);
    }

    @PostConstruct
    private void createQueue() {
        Queue queue = queue();
        DirectExchange directExchange = directExchange();
        Binding binding = bindingQueue(queue, directExchange);

        amqpAdmin.declareQueue(queue);
        amqpAdmin.declareExchange(directExchange);
        amqpAdmin.declareBinding(binding);
    }
}
