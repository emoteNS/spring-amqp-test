package com.test.test.Runners;

import com.test.test.Config.Management.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by enrique on 17/07/17.
 */
public class ProducerRunner implements CommandLineRunner {

    @Autowired
    private ConfigurableApplicationContext ctx;

    @Autowired
    Producer sender;

    @Override
    public void run(String [] arg0) throws Exception {

        int times = arg0.length == 0? 20: Integer.parseInt(arg0[0]);

        System.out.println("Sender Started");

        sender.send(times);
        ctx.close();
    }

}
