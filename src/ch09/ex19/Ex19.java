package ch.ex19;

import ch.ex19.access.FactoryCoin;
import ch.ex19.access.FactoryCube;
import ch.ex19.access.PlayGame;

/**
 * Created by V1 on 14-Feb-17.
 */
public class Ex19 {
    public static void main(String[] args) {
        System.out.println("\nExercise 19 Factory Pattern Interface Check\n");
        PlayGame.playGame(new FactoryCoin());
        System.out.println();
        PlayGame.playGame(new FactoryCube());

    }
}
