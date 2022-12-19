package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class HockeyCoach implements Coach
{
    @Autowired // Also used for field injection
    @Qualifier("happyFortuneService")
    private FortuneService fortuneService;
    @Override
    public String getDailyWorkout() {
        return "Spend 30 mins on hockey practice";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
