package com.distinctgeeks.rmq.user.app.producer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
public class DirectExchangeProducerService {


    private final RabbitTemplate rabbitTemplate;


    private DirectExchangeProducerService(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }


    public String publishMessage(DGUser dgUser){
        rabbitTemplate.convertAndSend(DirectExchangeConfig.EXCHANGE_NAME,DirectExchangeConfig.QUEUE_NAME,dgUser);
        return "message enqueued successfully with exchange: %s and queue: %s".formatted(DirectExchangeConfig.EXCHANGE_NAME, DirectExchangeConfig.QUEUE_NAME);
    }
}
