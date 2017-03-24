package ch09.ex12a;

import ch09.ex12a.access.Bee;

/**
 * Created by V1 on 13-Feb-17.
 */
public class Ex12a {
    public static void main(String[] args) {
        System.out.println("\nExercise 12a Diamond Problem Interface Check\n");
        Bee bee = new Bee();
        bee.born();
        bee.move();
        bee.fly();
        bee.attack();
        bee.sting();

    }
}
