package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("*** Spring with java annotation *** \n");

        //rading the config file
        var context = new ClassPathXmlApplicationContext("ApplicationContextForReadingAnnotations.xml");

        //featching the bean
        var tennisCoach = context.getBean("tennisCoach",Coach.class);

        var footballCoach = context.getBean("footballCoach", Coach.class); // default bean id

        var hockeyCoach = context.getBean("hockeyCoach", Coach.class);

        System.out.println(tennisCoach.getDailyWorkout());
        System.out.println(tennisCoach.getDailyFortune());

        System.out.println("\n");

        System.out.println(footballCoach.getDailyWorkout());
        System.out.println(footballCoach.getDailyFortune());

        System.out.println("\n");

        System.out.println(hockeyCoach.getDailyWorkout());
        System.out.println(hockeyCoach.getDailyFortune());

        //close the context
        context.close();
    }
}