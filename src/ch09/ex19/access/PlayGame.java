package ch09.ex19.access;

/**
 * Created by V1 on 14-Feb-17.
 */
public class PlayGame {
    public static void playGame(IGameFactory gameFactory) {
        Game game  = gameFactory.newGame();
        System.out.println("Game Started");
        while (game.getMove()) {  // ходить до упора

        }
        System.out.println("Game Over");
    }


}
