package ch.ex17.game;

/**
 * Created by V1 on 14-Feb-17.
 */
public class GameCoin implements IGame {
    private final int MOVE_COUNTS = 10;
    private int move = 0;  // число ходов
    private PlayerCoin  p1 = new PlayerCoin("Player1");
    private PlayerCoin  p2 = new PlayerCoin("Player2");


    @Override
    public boolean getMove() {

        if (move  >= MOVE_COUNTS) {
            if (p1.getScore() > p2.getScore()) {
                System.out.println("Player 1 Win");
            }
            if (p2.getScore() > p1.getScore()) {
                System.out.println("Player 2 Win");
            }
            if (p1.getScore() == p2.getScore()) {
                System.out.println("Due IGame");
            }

            return false;    // IGame Over
        }
        move++;
        p1.setMove();  // set Score
        p1.showStatus();
        p2.setMove();  // set Score
        p2.showStatus();
        System.out.println();
        return true; // 1..2
    }

    public static IGameFactory factory = new IGameFactory() {
        @Override
        public IGame newGame() {
            return new GameCoin();
        }
    };

}
