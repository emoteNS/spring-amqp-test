package com.test.test.tut1;

import com.test.test.Models.Animal;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

/**
 * Created by enrique on 17/07/17.
 */
@RabbitListener(queues = "hello")
public class Tut1Receiver {
    @RabbitHandler
    public void receive(Animal in){
        System.out.println(" [x] Received '" + in.toString() + "'");
    }
}
