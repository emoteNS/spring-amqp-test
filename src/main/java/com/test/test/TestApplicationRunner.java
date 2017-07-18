package com.test.test;

import com.test.test.tut1.Tut1Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by enrique on 17/07/17.
 */
public class TestApplicationRunner implements CommandLineRunner {

    @Value("${tutorial.client.duration:0}")
    private int duration;

    @Autowired
    private ConfigurableApplicationContext ctx;

    @Autowired
    Tut1Sender sender;

    @Override
    public void run(String [] arg0) throws Exception {

        int times = arg0.length == 0? 20: Integer.parseInt(arg0[0]);

        System.out.println("Ready ... running");

        sender.send(times);
        ctx.close();
    }

}
