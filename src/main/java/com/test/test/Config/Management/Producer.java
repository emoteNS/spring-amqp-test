package com.test.test.Config.Management;

import com.test.test.Models.Animal;
import com.test.test.Models.AnimalBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by enrique on 17/07/17.
 */
@Profile("sender")
@Component
public class Producer {

    private final Logger log = LoggerFactory.getLogger("PROVIDER");

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    DirectExchange directExchange;

    @Autowired
    private Queue queue;

    public void send(int times){
        for(int i = 0; i< times; i++) {
            Animal animal = AnimalBuilder.getAnimal();
            this.rabbitTemplate.convertAndSend(queue.getName(), animal);
            log.info(" [x] Sent '" + animal + "'");
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                log.warn(e.getStackTrace().toString());
            }
        }
    }
}