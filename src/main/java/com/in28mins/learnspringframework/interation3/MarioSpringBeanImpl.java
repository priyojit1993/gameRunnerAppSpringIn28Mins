package com.in28mins.learnspringframework.interation3;

public class MarioSpringBeanImpl implements GamingConsoleSpringBean {
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
