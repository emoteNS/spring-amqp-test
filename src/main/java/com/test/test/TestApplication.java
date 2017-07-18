package com.test.test;

import com.test.test.Runners.ConsumerRunner;
import com.test.test.Runners.ProducerRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
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

    @Profile("receiver")
    @Bean
    public CommandLineRunner tutorial(){
        return new ConsumerRunner();
    }

    @Profile("sender")
    @Bean
    public CommandLineRunner sender(){
        return new ProducerRunner();
    }

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }
}
