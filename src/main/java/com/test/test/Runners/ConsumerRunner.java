package com.test.test.Runners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 *
 */
@Profile("receiver")
@Component
public class ConsumerRunner implements CommandLineRunner {

    private final Logger log = LoggerFactory.getLogger("CONSUMER RUNNER");

    @Override
    public void run(String[] arg0) throws InterruptedException {
        log.info("CONSUMER STARTED");
        for (; ; )
            Thread.sleep(300000L);
    }
}