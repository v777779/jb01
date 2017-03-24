package ch.ex38.access;

import ch.ex38.access.decorator.*;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise Check\n");
        WhippedCream wp = new WhippedCream(new Basic());
        wp.setType("coffee "+wp.getType());  // ???  работает но совсем не так как хотелось бы
        System.out.println(wp.getType());    // надо обязательно втащить coffee в конструктор

        Decorator c = new FoamCoffee(new StreamedMilk(new WhippedCream(new Basic("coffee"))));
        System.out.println(c.getType());
    }
}
