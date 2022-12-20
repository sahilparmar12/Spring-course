package org.example;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach
{
    @Override
    public String getDailyWorkout() {
        return "Practice batting for 30 mins";
    }

    @Override
    public String getDailyFortune() {
        return "All the very best";
    }
}
