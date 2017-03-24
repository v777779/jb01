package ch10.ex16.games;

/**
 * Created by V1 on 14-Feb-17.
 */
public class Chess implements IGame {
    private final int MOVES_CNT = 4;
    private int moves = 0;
    @Override
    public boolean move() {
        System.out.println("Chess.move."+ ++moves);
        return (moves < MOVES_CNT);
    }

    public static IGameFactory factory = new IGameFactory() {
        @Override
        public IGame getGame() {
            return new Chess();
        }
    };

}
