package com.example.springselenium.config;

import com.github.javafaker.Faker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FakerConfig {

    /*
    Here we are creating a new instance of a Faker
     */
    @Bean
    public Faker getFaker(){
        return new Faker();
    }

}
