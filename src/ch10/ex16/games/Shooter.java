package ch.ex16.games;

/**
 * Created by V1 on 14-Feb-17.
 */
public class Shooter implements IGame {
    private final int MOVES_CNT = 5;
    private int moves = 0;
    @Override
    public boolean move() {
        System.out.println("Shooter.move."+ ++moves);
        return (moves < MOVES_CNT);
    }

    public static IGameFactory factory = new IGameFactory() {
        @Override
        public IGame getGame() {
            return new Shooter();
        }
    };

}
