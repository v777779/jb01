package ch14.ex18.access;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app(String[] args) {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 18 NonPublic Constructor Visibility Check\n");

        System.out.println("Ex17 <public> class Methods:");
        args = new String[]{"ch14.ex17.access.Methods","Methods"};
        Methods.show(args);

        System.out.println("\nEx18 <non public> class Methods:");
        args = new String[]{"ch14.ex18.access.Methods","Methods"};
        Methods.show(args);

    }
}
