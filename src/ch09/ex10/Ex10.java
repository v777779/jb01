package ch09.ex10;

import ch09.ex10.instrument.*;

/**
 * Created by V1 on 12-Feb-17.
 */
public class Ex10 {
    public static void main(String[] args) {
        System.out.println("\nExercise 10 Interface Movement Check\n");
        Playable[] plays = new Playable[]{
                new Trumpet(),
                new Vilolin(),
                new Flute(),
                new WoodWind()
        };

        Music.tuneAll(plays);

    }
}
