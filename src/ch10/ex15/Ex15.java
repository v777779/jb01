package ch.ex15;

import ch.ex15.access.BuildStadium;
import ch.ex15.access.Stadium;

/**
 * Created by V1 on 15-Feb-17.
 */
public class Ex15 {

    public static void main(String[] args) {
        System.out.println("\nExercise 15 Anonymouse Class Check\n");

        Stadium st = new BuildStadium().getStadium();  // получили стадион
        System.out.println(st);
    }
}
