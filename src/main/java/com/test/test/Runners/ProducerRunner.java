package com.test.test.Runners;

import com.test.test.Config.Management.Producer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 *
 */
@Profile("sender")
@Component
public class ProducerRunner implements CommandLineRunner {

    private final Logger log = LoggerFactory.getLogger("PRODUCER RUNNER");

    @Autowired
    private ConfigurableApplicationContext ctx;

    @Autowired
    Producer sender;

    @Override
    public void run(String[] arg0) throws Exception {

        int times = arg0.length == 0 ? 20 : Integer.parseInt(arg0[0]);

        log.info("PRODUCER STARTED");

        sender.send(times);
        ctx.close();
    }

}
