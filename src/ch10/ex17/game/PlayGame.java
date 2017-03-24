package ch.ex17.game;

/**
 * Created by V1 on 14-Feb-17.
 */
public class PlayGame {
    public static void playGame(IGameFactory factory) {
        IGame game  = factory.newGame();
        System.out.println("Game Started");
        while (game.getMove()) {  // ходить до упора

        }
        System.out.println("Game Over");
    }

    public static void playGame(IGame game) {
        System.out.println("Game Started");
        while (game.getMove()) {  // ходить до упора

        }
        System.out.println("Game Over");
    }

}
