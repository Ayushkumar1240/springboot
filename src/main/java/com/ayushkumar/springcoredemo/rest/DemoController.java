package com.ayushkumar.springcoredemo.rest;

import com.ayushkumar.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private  Coach myCoach;


    // CONSTRUCTOR INJECTION

    @Autowired
    public DemoController(@Qualifier("trackCoach") Coach theCoach){
        System.out.println("In Constructor:"+getClass().getSimpleName());
        myCoach=theCoach;
    }

    // SETTER INJECTION
//    @Autowired
//    public void setCoach(Coach theCoach){
//        myCoach=theCoach;
//    }
    @GetMapping("/dailyWorkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
