package ch15.ex32.access;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 32 Cast and Generics Check\n");
        try {
            FixedSizeStack.stackTest();
        } catch (Exception e) {
            System.out.println("catch: "+e.toString().replaceAll("\\w+\\.",""));
        }

    }
}
