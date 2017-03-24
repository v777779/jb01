package ch.ex16;


import ch.ex16.cycle.*;
import ch.ex16.games.*;
import ch.ex16.local.*;


/**
 * Created by V1 on 15-Feb-17.
 */
public class Ex16 {
    public static void main(String[] args) {
        System.out.println("\nFactory Pattern IService Anonymous Class Check\n");
        IService eq1 = Equipment1.factory.getService();  // работа с объектом IFactory
        IService eq2 = Equipment2.factory.getService();
        eq1.method1();
        eq1.method2();
        eq2.method1();
        eq2.method2();

        System.out.println("\nFactory Pattern IGame Anonymous Class Check\n");

        PlayGame.playGame(Checkers.factory);  // работа с объектом IGameFactory
        PlayGame.playGame(Chess.factory);
        PlayGame.playGame(Arcade.factory);
        PlayGame.playGame(RPG.factory);
        PlayGame.playGame(Shooter.factory);

        System.out.println("\nExercise 16 Factory Pattern Anonimous Class Check\n");
        Cycle.buildCycle(Unicycle.factory); // получить через фабрику и использовать
        Cycle.buildCycle(Bicycle.factory);
        Cycle.buildCycle(Tricycle.factory);

        System.out.println("\nExercise 16 Factory Pattern Anonimous Class Check\n");

        Cycle.buildCycle(Unicycle.getCycle()); // получить через фабрику и использовать
        Cycle.buildCycle(Bicycle.getCycle());
        Cycle.buildCycle(Tricycle.getCycle());



    }
}
