package com.ayushkumar.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;


@Component
public class TrackCoach implements Coach{
    public TrackCoach(){
        System.out.println("In Constructor: "+getClass().getSimpleName());
    }

    // doing my  init stuff
    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println("In doMyStartUpStuff() : "+getClass().getSimpleName());
    }

    // doing my cleanup stuff
    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println("In doMyCleanupStuff() : "+getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "This is track Coach";
    }
}
