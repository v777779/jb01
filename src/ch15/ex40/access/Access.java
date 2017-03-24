package ch15.ex40.access;

import ch15.ex40.access.latent.*;
import ch15.ex40.access.pets.*;


/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 40 Latent w Reflection Check\n");
        try {
            Apply.apply(Pets.getList(10), Pet.class.getMethod("speak"));
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
