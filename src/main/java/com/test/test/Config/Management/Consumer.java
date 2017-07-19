package com.test.test.Config.Management;

import com.test.test.Models.Animal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 *
 */
@Profile("receiver")
@Component
@RabbitListener(queues = "animals")
public class Consumer {

    private final Logger log = LoggerFactory.getLogger("CONSUMER");

    @RabbitHandler
    public void receive(Animal in){
        log.info(" [x] Received '{}'", in);
    }
}
