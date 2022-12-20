package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
//@ComponentScan("org/example") //This annotation is used by spring to scan the annotations without any XML file
                                // TO see the working remove the comment from this annotation and try to run the program
public class SportConfig
{
    //define bean for sad fortune
    @Bean
    public FortuneService badFortune(){
        return new SadFortuneService();
    }

    // define bean for our swim coach class
    @Bean
    public Coach swimCoach()
    {
        return new SwinCoach(badFortune());
    }
}
