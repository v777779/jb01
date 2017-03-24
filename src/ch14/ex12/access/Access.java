package ch14.ex12.access;

import ch14.ex12.access.coffee.Coffee;
import ch14.ex12.access.coffee.CoffeeGen;
import ch14.ex12.access.coffee.TypeCount;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 12 Class   Check\n");

        TypeCount tc = new TypeCount(Coffee.class);  // создали счетчик для класса Coffee

        for (Coffee coffee : new CoffeeGen(10)) {
            System.out.println(coffee);
            tc.count(coffee);
        }
        System.out.println(tc);

    }
}
