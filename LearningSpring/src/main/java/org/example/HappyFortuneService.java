package org.example;

public class HappyFortuneService implements FortuneService
{
    @Override
    public String getFortune() {
        return "You have a lucky day";
    }
}
