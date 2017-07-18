package com.test.test.Runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by enrique on 17/07/17.
 */
public class ConsumerRunner implements CommandLineRunner {
    @Autowired
    private ConfigurableApplicationContext ctx;

    @Override
    public void run(String [] arg0) throws Exception {
        System.out.println("Consumer Started");

        Thread.sleep(120000L);
        ctx.close();
    }
}
