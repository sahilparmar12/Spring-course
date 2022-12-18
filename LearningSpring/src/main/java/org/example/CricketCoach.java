package org.example;

public class CricketCoach implements Coach
{
    private FortuneService fortuneService;

    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        System.out.println("Set email");
        this.email = email;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("Set team");
        this.team = team;
    }

    private String team;

//    public FortuneService getFortuneService() {
//        return fortuneService;
//    }

    //no arg constructor
    public CricketCoach()
    {
        System.out.println("in cricket class");
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice balling for 15 min";
    }

    @Override
    public String getDailyFortune() {
        System.out.println("A nice day for cricket");
        return fortuneService.getFortune();
    }

    public String getInfo()
    {
        return(getEmail() + " "+getTeam());
    }
}
