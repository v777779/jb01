package ch15.ex33.access;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 33 Generic Cast Check\n");

        FixedSizeStack.stackTest();
        System.out.println();
        try {
            FixedSizeStackEx.stackTestOverflow();
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println();
        try {
            FixedSizeStackEx.stackTestEmpty();
        } catch (Exception e) {
            System.out.println("\n"+e);

        }


    }
}
