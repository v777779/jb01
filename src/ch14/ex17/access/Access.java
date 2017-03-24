package ch14.ex17.access;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app(String[] args) {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 17 Methods Check\n");

        if (args.length < 1) {
//            args = new String[]{"ch14.ex16.access.coffee.CoffeeGen"};
            args = new String[]{"ch14.ex17.access.Methods"};
        }
           Methods.show(args);




    }
}
