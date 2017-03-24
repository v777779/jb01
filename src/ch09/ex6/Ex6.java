package ch.ex6;

import ch.ex5.instrument.Wind;
import ch.ex6.local.Violin;

/**
 * Created by V1 on 12-Feb-17.
 */
public class Ex6 {
    public static void main(String[] args) {
        System.out.println("\nExercise 6 Interface Public Method Check\n");
        Wind wind = new Wind();
        wind.move();
        wind.check();

        System.out.println("\nInterface Public Check\n");
        Violin violin = new Violin();
        violin.move();
        violin.check();

    }
}
