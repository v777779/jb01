package ch13.ex20.access;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 20 Scanner Check\n");
        String s = " 256 19864 1.235478 1.897463 string \n |value data  ";
        DataIn d  = new DataIn(s);
        System.out.println(d);
    }
}
