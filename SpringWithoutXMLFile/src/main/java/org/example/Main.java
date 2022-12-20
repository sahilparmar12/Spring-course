package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        var context = new AnnotationConfigApplicationContext(SportConfig.class);

        //var cricketCoach = context.getBean("cricketCoach",Coach.class);
        var swimCoach = context.getBean("swimCoach", Coach.class);

        //System.out.println("For cricket " + cricketCoach.getDailyWorkout());

        System.out.println("for swim class:  " + swimCoach.getDailyWorkout() + "\n \t" + swimCoach.getDailyFortune());

    }
}