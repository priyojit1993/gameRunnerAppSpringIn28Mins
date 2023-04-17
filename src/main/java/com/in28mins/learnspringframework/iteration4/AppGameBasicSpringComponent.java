package com.in28mins.learnspringframework.iteration4;

import com.in28mins.learnspringframework.LearnSpringFrameworkApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
@SpringBootApplication

public class AppGameBasicSpringComponent {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(LearnSpringFrameworkApplication.class, args);
        MarioSpringComponentImpl marioSpringComponent = run.getBean(MarioSpringComponentImpl.class);
        marioSpringComponent.up();
        marioSpringComponent.down();
        marioSpringComponent.left();
        marioSpringComponent.right();

    }
}
