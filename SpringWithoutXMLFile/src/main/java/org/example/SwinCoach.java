package org.example;

public class SwinCoach implements  Coach
{
    private FortuneService fortuneService;

    public SwinCoach(FortuneService fortuneService)
    {
        this.fortuneService = fortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "Spend 30 mins in water";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getDailyFortune();
    }


}
