package com.test.test.Config.Management;

import com.test.test.Models.Animal;
import com.test.test.Models.AnimalBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 *
 */
@Profile("sender")
@Component
public class Producer {

    private final Logger log = LoggerFactory.getLogger("PRODUCER");

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private Queue queue;

    public void send(int times) throws InterruptedException {
        for (int i = 0; i < times; i++) {
            Animal animal = AnimalBuilder.getAnimal();
            rabbitTemplate.convertAndSend(queue.getName(), animal);
            log.info(" [x] Sent {}", animal);
            Thread.sleep(1000L);
        }
    }
}