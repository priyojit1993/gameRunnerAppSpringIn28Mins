package com.in28mins.learnspringframework.iteration2;

public class AppGamingBasic {
    public static void main(String[] args) {
        var marioGame = new MarioGameImpl();// object creation
        SuperContraGameImpl superContraGame = new SuperContraGameImpl();// object creation
        GameRunnerLooselyCoupledJava gameRunnerLooselyCoupledJava = new GameRunnerLooselyCoupledJava();// object creation
        System.out.println("--------------- Running Mario --------------------------");
        gameRunnerLooselyCoupledJava.setGamingConsole(marioGame);//wiring dependency (GamingConsole is dependency of GameRunnerLooselyCoupledJava class) and in this line we are injecting the dependency using setter call. but here the creation of object and the injection of dependencies into those objects are done by the us.
        gameRunnerLooselyCoupledJava.run();
        System.out.println("--------------- Running SuperContra --------------------------");
        gameRunnerLooselyCoupledJava.setGamingConsole(superContraGame);
        gameRunnerLooselyCoupledJava.run();
    }
}
