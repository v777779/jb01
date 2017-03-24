package ch13.ex01.access;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 1 String \"+\" Check\n");

        SprinklerSystem sp = new SprinklerSystem();
        System.out.println(sp.toString());
    }
}
