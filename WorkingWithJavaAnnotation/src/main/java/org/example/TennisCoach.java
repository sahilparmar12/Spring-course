package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tennisCoach")
public class TennisCoach implements Coach
{
    private FortuneService fortuneService;

    public TennisCoach()
    {

    }
    @Autowired
    public TennisCoach(@Qualifier("databaseFortuneService") FortuneService fortuneService)
    {
        this.fortuneService = fortuneService;
    }
    @Override
    public String getDailyWorkout()
    {
        return "Spend 30 mins in the court";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
