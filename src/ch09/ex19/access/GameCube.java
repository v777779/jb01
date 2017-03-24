package ch09.ex19.access;

/**
 * Created by V1 on 14-Feb-17.
 */
public class GameCube implements Game {
    final int MOVES_COUNT = 36;
    private int move = 0;  // число ходов
    private PlayerCube  p1 = new PlayerCube("Player1");
    private PlayerCube  p2 = new PlayerCube("Player2");

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
                System.out.println("Due Game");
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
}
