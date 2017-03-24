package ch10.ex17.game;

import java.util.Random;

/**
 * Created by V1 on 14-Feb-17.
 */
public class PlayerDice implements IPlayer{
    private int move;
    private int score;
    private String sMove;
    private Random rnd = new Random();
    private int count;
    private String name;

    public PlayerDice(String name) {
        this.name = name;
        sMove = "";
        count = 0;
        move = 0;
        score = 0;
    }

    public void setMove() {
        move  = rnd.nextInt(6)+1;
        setScore();
        sMove = String.valueOf(move);
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
        score += move;
    }

    @Override
    public void showStatus() {
        System.out.printf("%s move: % 3d  result: %s score:% 3d\n",name,count,sMove, score);

    }
}
