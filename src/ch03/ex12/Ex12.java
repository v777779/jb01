package ch.ex12;

import ch.ex10.Int;

/**
 * Created by V1 on 04-Feb-17.
 */

public class Ex12 {
    public static void main(String[] args) {

        System.out.println("\nExercise 12\n");
        int c = -1;
        c <<=1;
        for (int j = 0; j < 32; j++) {
            System.out.println(Int.toBinaryString(c));
            c>>>=1;
        }
    }
}
