package ch.ex16.games;

/**
 * Created by V1 on 14-Feb-17.
 */
public class RPG implements IGame {
    private final int MOVES_CNT = 7;
    private int moves = 0;
    @Override
    public boolean move() {
        System.out.println("RPG.move."+ ++moves);
        return (moves < MOVES_CNT);
    }
    public static IGameFactory factory = new IGameFactory() {
        @Override
        public IGame getGame() {
            return new RPG();
        }
    };

}
