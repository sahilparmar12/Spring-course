package org.example;

public class TrackCoach implements Coach
{
    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService)
    {
        this.fortuneService = fortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "Spend 30 mins on track";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    //add an init method
    public void doMyStuff()
    {
        System.out.println("This is init-method");
    }

    // add destroy method
    public void stopMyStuff()
    {
        System.out.println("This is destroyer method");
    }


}
