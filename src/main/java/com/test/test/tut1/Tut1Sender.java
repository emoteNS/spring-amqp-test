package com.test.test.tut1;

import com.test.test.Models.Animal;
import com.test.test.Models.AnimalBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by enrique on 17/07/17.
 */
@Profile("sender")
@Component
public class Tut1Sender {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private Queue queue;

    public void send(int times){
        Animal animal = AnimalBuilder.getAnimal();

        for(int i = 0; i< times; i++) {
            this.rabbitTemplate.convertAndSend(queue.getName(), animal);
            System.out.println(" [x] Sent '" + animal + "'");
        }
    }
}
