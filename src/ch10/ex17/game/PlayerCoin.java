package ch10.ex17.game;

import java.util.Random;

/**
 * Created by V1 on 14-Feb-17.
 */
public class PlayerCoin implements IPlayer{
    private boolean move;
    private int score;
    private String sMove;
    private Random rnd = new Random();
    private int count;
    private String name;

    public PlayerCoin(String name) {
        this.name = name;
        sMove = "";
        count = 0;
        move = false;
        score = 0;
    }

    public void setMove() {
        move = rnd.nextBoolean();
        count++;
        sMove = (move)?"head":"tail";  // true or false
        setScore();
    }

    @Override
    public String getMove() {
        return sMove;
    }

    @Override
    public int getScore() {
        return score;
    }

    @Override
    public void setScore() {
        score += (sMove.equals("head"))?1:0;

    }

    public void showStatus() {
        System.out.printf("%s move: % 3d  result: %s score:% 3d\n",name,count,sMove, score);
    }
}
