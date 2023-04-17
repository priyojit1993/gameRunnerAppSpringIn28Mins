package com.in28mins.learnspringframework.interation3;

public class SuperContraSpringBeanImpl implements GamingConsoleSpringBean{
    public void up() {
        System.out.println("Jump");
    }

    public void down() {
        System.out.println("Sit down");
    }

    public void left() {
        System.out.println("Go back");
    }

    public void right() {
        System.out.println("Fire Bullet");
    }
}
