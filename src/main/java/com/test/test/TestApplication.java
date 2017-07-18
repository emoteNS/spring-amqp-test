package com.test.test;

import com.test.test.Runners.ConsumerRunner;
import com.test.test.Runners.ProducerRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
@EnableAutoConfiguration
public class TestApplication {
    @Profile("receiver")
    @Bean
    public CommandLineRunner tutorial() {
        return new ConsumerRunner();
    }

    @Profile("sender")
    @Bean
    public CommandLineRunner sender() {
        return new ProducerRunner();
    }

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }
}
