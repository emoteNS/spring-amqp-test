package com.test.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <h1>TestApplication</h1>
 * The TestApplication implements a message queue
 * <p>Producer<p/> and <p>Consumer</p> using rabbitmq.
 *
 * The application uses profiles to specify the desired
 * behavior.
 *
 * This application may be executed inside a Docker
 * container (see pom file to check details on docker plugin)
 */
@SpringBootApplication
public class TestApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }
}