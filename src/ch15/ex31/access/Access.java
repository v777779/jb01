package ch.ex31.access;


/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 31 Interface w Generic Check\n");
        Employee[] e = new Employee[]{new Employee(), new Technics()};
        e[0].payCheck(new Employee());
        e[1].payCheck(new Employee());
        e[0].payCheck(new Technics());
        e[1].payCheck(new Technics());

    }
}
