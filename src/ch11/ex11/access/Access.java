package ch11.ex11.access;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 11 Iterator  Check\n");
        Collect c = new Collect();

        c.show(c.aList.iterator());
        c.show(c.lList.iterator());
        c.show(c.hSet.iterator());
        c.show(c.tSet.iterator());

    }
}
