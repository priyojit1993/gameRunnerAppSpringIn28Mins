package com.in28mins.learnspringframework.interation3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Introduced in java 16 eliminate the need of creating constructor and easy way to define a class
 * equals hashCode toString are auto created
 * public accessor methods constructors are also auto created.
 */
record Person(String name, int age) {
};

//indicates that this is configuration class and can declare one or more spring bean(java classes managed by spring)
@Configuration
public class HelloWorldConfiguration {
    @Bean
//annotation that indicates that the following method creates a bean/java class that is managed by spring in this case the bean that is managed by spring is a String class.
    public String name() {
        return "Ranga";
    }

    //here we are injecting the bean name into the Person bean using autowiring.
    @Bean
    public Person person(String name) {
        return new Person(name, 1234);
    }


    @Bean
    @Profile("contra")
    public SuperContraSpringBeanImpl superContraSpringBean() {
        return new SuperContraSpringBeanImpl();
    }

    @Bean
    @Profile("mario")
    public MarioSpringBeanImpl mariSpringBean() {
        return new MarioSpringBeanImpl();
    }

    @Bean
    public GameRunnerSpringBean gameRunnerSpringBean(GamingConsoleSpringBean gamingConsoleSpringBean) {
        return new GameRunnerSpringBean(gamingConsoleSpringBean);
    }

}
