package ch.ex25;

import ch.ex25.access.Access;
import ch.ex25.local.Local;

/**
 * Created by V1 on 17-Feb-17.
 */
public class Ex25 {
    public static void main(String[] args) {
        System.out.println("\nInner Class Closure Check\n");
        Local.app();  // запуск обучалки с ./orange
        System.out.println("\nExercise 25 Event Framework Check\n");
        Access.app(); // запуск обучалки с ./include
    }
}
