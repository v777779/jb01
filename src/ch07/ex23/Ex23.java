package ch07.ex23;

import ch07.ex23.local.Beetle;
import ch07.ex23.local.Wing;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Ex23 {
    public static void main(String[] args) {
        System.out.println("\nClass Init Sequence Check\n");
        Beetle beetle = new Beetle();

        System.out.println("\nExercise Class Load Check\n");

        Beetle beetle1 = new Beetle();

        System.out.println("\nClass Init Sequence Sheck\n");
        Wing.getWingX4();

    }
}
