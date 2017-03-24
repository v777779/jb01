package ch.ex18.gamer;

/**
 * Created by V1 on 14-Feb-17.
 */
public class Chess implements Game {
    private final int MOVES_CNT = 4;
    private int moves = 0;
    @Override
    public boolean move() {
        System.out.println("Chess.move."+ ++moves);
        return (moves < MOVES_CNT);
    }
}
