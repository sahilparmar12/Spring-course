package org.example;

import org.springframework.stereotype.Component;

@Component
public class RandomService implements FortuneService
{
    @Override
    public String getFortune() {
        return "This is random fortune service";
    }
}
