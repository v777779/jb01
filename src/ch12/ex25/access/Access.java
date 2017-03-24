package ch12.ex25.access;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 25 Exceptions Matching Check\n");
        ClassA c = new ClassC();

        try {
            c.getValue();
        } catch (PlaceEx e) {
            System.out.println("catch:"+e.getClass().getSimpleName());
        }
    }
}
