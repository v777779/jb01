package ch10.ex16.games;

/**
 * Created by V1 on 14-Feb-17.
 */
public class Checkers implements IGame {   // реализация интерфейс игры шашки
    private final int MOVES_CNT = 3;
    private int moves = 0;

    @Override
    public boolean move() {
        System.out.println("Checkers.move." + ++moves);
        return (moves < MOVES_CNT);
    }

    public static IGameFactory factory = new IGameFactory() {
        @Override
        public IGame getGame() {
            return new Checkers();
        }
    };

    public static IGame getGame() {  // static method
        return new Checkers();
    }
}
