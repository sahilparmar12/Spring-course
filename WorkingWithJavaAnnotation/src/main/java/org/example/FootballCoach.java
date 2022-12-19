package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")// it is not necessary to give a bean id to a class Spring make a defalut bean id
// first capital letter is replaced by the small alphabet and this makes the defalut bean id
// in this case it will be footballCoach
public class FootballCoach implements Coach
{
    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Spend 30 min practicing kick ";
    }

    @Autowired  //Autowired annotation is used for both setter and constructor injection
    @Qualifier("randomService")// we can use Autowire annotation with any method for dependency injection.
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    //@PostConstructor and @PreDestroy annotations were used for bean life cycle
    // These annotations will be declare above any method
}
