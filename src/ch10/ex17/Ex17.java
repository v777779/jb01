package ch10.ex17;

import ch10.ex17.game.*;


/**
 * Created by V1 on 15-Feb-17.
 */
public class Ex17 {
    public static void main(String[] args) {
        System.out.println("\nExercise 17 Factory Pattern IGame Anonymous Class Check\n");
        PlayGame.playGame(GameCoin.factory);

        System.out.println("\nExercise 17 Factory Pattern IGame Anonymous Class Check\n");
        PlayGame.playGame(GameDice.factory);
    }
}
