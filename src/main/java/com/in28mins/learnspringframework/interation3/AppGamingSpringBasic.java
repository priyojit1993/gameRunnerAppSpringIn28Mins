package com.in28mins.learnspringframework.interation3;

import org.springframework.boot.SpringApplication;

public class AppGamingSpringBasic {
    public static void main(String[] args) {
        //1. launch spring context.
        //2. Configure the things that we want spring to manage - @Configuration
        var context = SpringApplication.run(HelloWorldConfiguration.class, args); // created a spring application context using spring configuration class

        // Retrieve bean via name
        String name = (String) context.getBean("name");
        System.out.println(name);
        var person = (Person) context.getBean("person");
        System.out.println(person.name());
        System.out.println(person.age());

        GameRunnerSpringBean ga = context.getBean(GameRunnerSpringBean.class);
        ga.run();

    }
}
