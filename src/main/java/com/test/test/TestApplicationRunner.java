package com.test.test;

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

    @Override
    public void run(String [] arg0) throws Exception {

        int times = (arg0.length == 0? 5: Integer.parseInt(arg0[0]))*1000;

        System.out.println("Ready ... running for " + times/1000 + " times");
        Thread.sleep(times);
        ctx.close();
    }

}
