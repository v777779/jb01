package ch.ex17.game;

/**
 * Created by V1 on 14-Feb-17.
 */
public class GameDice implements IGame {
    final int MOVES_COUNT = 36;
    private int move = 0;  // число ходов
    private PlayerDice p1 = new PlayerDice("Player1");
    private PlayerDice p2 = new PlayerDice("Player2");

    @Override
    public boolean getMove() {
        if (move++ >= MOVES_COUNT) {
            if (p1.getScore() > p2.getScore()) {
                System.out.println("Player 1 Win");
            }
            if (p2.getScore() > p1.getScore()) {
                System.out.println("Player 2 Win");
            }
            if (p1.getScore() == p2.getScore()) {
                System.out.println("Due IGame");
            }

            return false;
        }

        p1.setMove();
        p1.showStatus();
        p2.setMove();
        p2.showStatus();
        System.out.println();

        return true;
    }

    public static IGameFactory factory = new IGameFactory() {
        @Override
        public IGame newGame() {
            return new GameDice();
        }
    };

}
