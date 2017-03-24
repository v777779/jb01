package ch09.ex18.gamer;

/**
 * Created by V1 on 14-Feb-17.
 */
public class Checkers implements Game {   // реализация интерфейс игры шашки
    private final int MOVES_CNT = 3;
    private int moves = 0;

    @Override
    public boolean move() {
        System.out.println("Checkers.move."+ ++moves);
        return (moves < MOVES_CNT);
    }
}
