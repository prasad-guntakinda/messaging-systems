package com.distinctgeeks.rmq.user.app.producer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    private DirectExchangeProducerService directExchange;


    @PostMapping
    String registerUser(@RequestBody DGUser dgUser){
        log.info("User Saved to DB.");
       return  directExchange.publishMessage(dgUser);
    }
}
