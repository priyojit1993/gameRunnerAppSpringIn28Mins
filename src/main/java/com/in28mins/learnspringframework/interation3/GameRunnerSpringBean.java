package com.in28mins.learnspringframework.interation3;

import com.in28mins.learnspringframework.iteration2.GamingConsole;

public class GameRunnerSpringBean {
    private GamingConsoleSpringBean gamingConsole;

    public GameRunnerSpringBean(GamingConsoleSpringBean gamingConsole) {
        this.gamingConsole = gamingConsole;
    }
    public void run() {
        System.out.println("Running game : " + gamingConsole);
        gamingConsole.up();
        gamingConsole.down();
        gamingConsole.left();
        gamingConsole.right();

    }
}
