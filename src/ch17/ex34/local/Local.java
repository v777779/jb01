package ch17.ex34.local;

import java.util.Random;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nMicroTest Check\n");
        RndBounds r = new RndBounds();
        if(new Random().nextBoolean()) {
            r.lower();
        }
        else {
            r.upper();
        }

    }
}
