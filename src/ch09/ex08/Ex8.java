package ch09.ex08;

import ch09.ex08.lunch.Sandwich;

/**
 * Created by V1 on 12-Feb-17.
 */
public class Ex8 {
    public static void main(String[] args) {
        System.out.println("\nExercise 8  Interface Check\n");
        Sandwich sandwich = new Sandwich();
        sandwich.order();
        sandwich.getWeight();
        sandwich.deliver();
        sandwich.check();
        sandwich.pay();
    }
}
