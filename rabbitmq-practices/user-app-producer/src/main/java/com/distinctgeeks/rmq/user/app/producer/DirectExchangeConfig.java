package com.distinctgeeks.rmq.user.app.producer;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DirectExchangeConfig {

    public static final String EXCHANGE_NAME = "user-app-direct-exchange";
    public static final String QUEUE_NAME = "user-app-greeting-queue";

    @Bean
    public DirectExchange directExchange(){
        return new DirectExchange(EXCHANGE_NAME);
    }


    @Bean
    public Queue queue(){
        return QueueBuilder.nonDurable(QUEUE_NAME).build();
    }

    @Bean
    public Binding binding(){
        return BindingBuilder.bind(queue()).to(directExchange()).withQueueName();
    }
}
