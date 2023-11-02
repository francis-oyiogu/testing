package com.example.demo3api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Demo3ApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo3ApiApplication.class, args);

    }

}
