package com.in28mins.learnspringframework.iteration1;

public class GameRunner {
    /**
     * Here GameRunner class is tightly coupled to MarioGame class and if in future we want gameRunner to call any other game
     * ForExample SuperContra game then we have to make changes in the gameRunner class whereby we have to include both superContra or marioGame into this class or change the dependencies as and when needed
     *
     * */
    private MarioGame marioGame;

//    private SuperContraGame superContraGame;
//  public GameRunner(SuperContraGame superContraGame) {
//        this.superContraGame = superContraGame;
//    }
    public GameRunner(MarioGame marioGame) {
        this.marioGame = marioGame;
    }


    public void run() {
        System.out.println("Running game : " + marioGame);
        marioGame.up();
        marioGame.down();
        marioGame.left();
        marioGame.right();

        /*
        *  System.out.println("Running game : " + superContraGame);
        superContraGame.up();
        superContraGame.down();
        superContraGame.left();
        superContraGame.right();
        *
        * */

    }
}
