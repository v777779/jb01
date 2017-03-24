package ch09.ex09;

import ch09.ex09.instrument.*;
import ch09.ex09.instrument.Music;

/**
 * Created by V1 on 12-Feb-17.
 */
public class Ex9 {
    public static void main(String[] args) {
        Instrument[] musics = new Instrument[]{
                new Trumpet(),
                new Vilolin(),
                new Flute(),
                new WoodWind()
        } ;
        System.out.println("\nExercise 9 Music Interface Check\n");
        Music.tuneAll(musics);

    }
}
