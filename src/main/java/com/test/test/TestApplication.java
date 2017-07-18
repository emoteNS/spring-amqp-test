package com.test.test;

import org.springframework.amqp.rabbit.annotation.RabbitListenerConfigurer;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.listener.RabbitListenerEndpointRegistrar;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class TestApplication {

    @Profile("usage_message")
    @Bean
    public CommandLineRunner usage(){
        return new CommandLineRunner() {
            @Override
            public void run(String... strings) throws Exception {
                System.out.println("This app uses Spring Profiles to control its behavior.\n");
                        System.out.println("Sample usage: java -jar rabbit-tutorials.jar" +
                                " --spring.profiles.active=hello-world,sender");
            }
        };
    }

    @Profile("!usage_message")
    @Bean
    public CommandLineRunner tutorial(){
        return new TestApplicationRunner();
    }

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }
}
