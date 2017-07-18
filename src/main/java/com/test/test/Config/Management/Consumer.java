package com.test.test.Config.Management;

import com.test.test.Models.Animal;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by enrique on 17/07/17.
 */
@Profile("receiver")
@Component
@RabbitListener(queues = "animals")
public class Consumer {
    @RabbitHandler
    public void receive(Animal in){
        System.out.println(" [x] Received '" + in.toString() + "'");
    }
}
