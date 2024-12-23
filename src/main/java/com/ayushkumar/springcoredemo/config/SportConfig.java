package com.ayushkumar.springcoredemo.config;

import com.ayushkumar.springcoredemo.common.Coach;
import com.ayushkumar.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    @Bean
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
