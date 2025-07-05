package com.distinctgeeks.rmq.user.app.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DirectExchangeListenerConfig {

    @RabbitListener(queues = {})
    public void receiveMessage(){

    }
}
