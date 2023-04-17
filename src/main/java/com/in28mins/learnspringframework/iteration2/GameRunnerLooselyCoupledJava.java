package com.in28mins.learnspringframework.iteration2;

public class GameRunnerLooselyCoupledJava {


    /**
     * Here we are achieving loosely coupling with help of java interface we are creating an interface name
     * GamingConsole which contains the basic blueprint of method for games and the generic classes are implementing
     * the interface and in the GameRunner class instead of tightly coupling to a particular game
     * we are coupling with the interface so that during runTime we can pass the corresponding implementation to be used.
     *
     * */
    private GamingConsole gamingConsole;

    public void setGamingConsole(GamingConsole gamingConsole) {
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
