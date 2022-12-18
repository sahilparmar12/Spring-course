package org.example;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp
{
   public static void main(String args[])
   {
       //load spring container
       var context = new ClassPathXmlApplicationContext("applicationContext.xml");
       //retrive bean from spring container
       var theCoach = context.getBean("baseballCoach",Coach.class);

       //without mentioning the interface it will return only an object and we have to type caste it
       var trackCoach = (Coach)context.getBean("trackCoach");

       var cricketCoach = context.getBean("cricketCoach",CricketCoach.class);

       //call methods on the bean
       System.out.println(theCoach.getDailyWorkout());
       System.out.println(trackCoach.getDailyWorkout());
       System.out.println(cricketCoach.getDailyWorkout());

       System.out.println(trackCoach.getDailyFortune());
       System.out.println(cricketCoach.getDailyFortune());
       System.out.println(cricketCoach.getInfo());

       //close the context
       context.close();
   }

}
