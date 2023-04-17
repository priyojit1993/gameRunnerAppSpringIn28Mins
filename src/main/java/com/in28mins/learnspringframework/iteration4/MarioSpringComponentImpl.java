package com.in28mins.learnspringframework.iteration4;

import org.springframework.stereotype.Component;

@Component
public class MarioSpringComponentImpl implements GamingConsoleSpringComponent{
    public void up() {
        System.out.println("Jump");
    }

    public void down() {
        System.out.println("Go into the hole");
    }

    public void left() {
        System.out.println("Go back");
    }

    public void right() {
        System.out.println("Accelerate");
    }
}
