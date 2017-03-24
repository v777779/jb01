package ch14.ex16.access;

import ch14.ex16.access.coffee.*;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 16 Factory Class Check\n");

        TypeCount tc = new TypeCount(Coffee.class);  // создали счетчик для класса Coffee
        for (Coffee coffee : new CoffeeGen(10)) {
            tc.count(coffee);
         }
        System.out.println(tc);

    }
}
