package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo
{
    public static void main (String args[])
    {
        var context = new ClassPathXmlApplicationContext("beanScopeApplicationContext.xml");

        // singleton scope of spring bean
        var theCoach = context.getBean("trackCoach",Coach.class);
        var anotherCoach = context.getBean("trackCoach",Coach.class);

        boolean result = theCoach == anotherCoach;

        System.out.println("Pointing to same object = " + result);

        System.out.println("Memory location of theCoach = "+ theCoach);

        System.out.println("Memory location of anotherCoach = "+ anotherCoach);

        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        //Prototype scope of spring bean
        var cricketCoach1 = context.getBean("baseballCoach",Coach.class);
        var cricketCoach2 = context.getBean("baseballCoach",Coach.class);

        boolean resultCricketCoach = cricketCoach1 == cricketCoach2;

        System.out.println("Pointing to same object of CricketCoach class = " + resultCricketCoach);

        System.out.println("Memory location of cricketCoach1 = "+ cricketCoach1);

        System.out.println("Memory location of cricketCoach2 = "+ cricketCoach2);

        System.out.println(cricketCoach1.getDailyWorkout());
        System.out.println(cricketCoach2.getDailyFortune());

        //closing the context
        context.close();
    }
}
