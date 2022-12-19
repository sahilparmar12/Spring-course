package org.example;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService
{
    @Override
    public String getFortune() {
        return "You have a nice day";
    }
}
