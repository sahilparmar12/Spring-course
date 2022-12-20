package org.example;

public class SadFortuneService implements  FortuneService
{
    @Override
    public String getDailyFortune() {
        return "Not a good day for you be careful";
    }
}
