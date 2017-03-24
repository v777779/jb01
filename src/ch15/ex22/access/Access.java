package ch.ex22.access;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 22 newInstance Check\n");
        System.out.println("Ball:");
        ClassFactory<Ball> cf = new ClassFactory<>(Ball.class);
        Ball b = cf.create("Green",125);
        System.out.println(b);

    }
}
