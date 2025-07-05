# RabbitMQ

        - Publisher
        - Message
        - Exchange
            - Direct
            - Topic
            - Fanout
            - Headers
            - Dead-letter
        - Queues
        - Binding
        - Consumer

## How to do retry?

## How to use dead-letter exchange?



## How to run RabbitMQ on localhost using docker?

````shell
# latest RabbitMQ 4.0.x
docker run -it --rm --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq
````


#### References:

1. https://spring.io/blog/2010/06/14/understanding-amqp-the-protocol-used-by-rabbitmq
2. https://www.rabbitmq.com/tutorials/tutorial-six-spring-amqp
3. https://docs.spring.io/spring-boot/api/java/org/springframework/boot/autoconfigure/amqp/RabbitProperties.html
4. 