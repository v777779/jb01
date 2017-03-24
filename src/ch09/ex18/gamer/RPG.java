package ch09.ex18.gamer;

/**
 * Created by V1 on 14-Feb-17.
 */
public class RPG implements Game {
    private final int MOVES_CNT = 7;
    private int moves = 0;
    @Override
    public boolean move() {
        System.out.println("RPG.move."+ ++moves);
        return (moves < MOVES_CNT);
    }
}
