package ch08.ex05;

import ch08.ex05.access.Bicycle;
import ch08.ex05.access.Cycle;
import ch08.ex05.access.Tricycle;
import ch08.ex05.access.Unicycle;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Ex5 {
    public static void main(String[] args) {
        Cycle [] cycles = new Cycle[3];

        System.out.println("\nExercise 5 Polymorphism Check\n");

        cycles[0] = new Unicycle();
        cycles[1] = new Bicycle();
        cycles[2] = new Tricycle();

        for (Cycle cycle : cycles) {
            cycle.ride();
        }


    }
}
