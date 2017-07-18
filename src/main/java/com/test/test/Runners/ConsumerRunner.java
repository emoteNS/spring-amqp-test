package com.test.test.Runners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by enrique on 17/07/17.
 */
public class ConsumerRunner implements CommandLineRunner {

    private final Logger log = LoggerFactory.getLogger("PROVIDER");

    @Override
    public void run(String[] arg0) throws Exception {
        log.info("Consumer Started");
        for (; ; )
            Thread.sleep(300000L);
    }
}
