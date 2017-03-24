package ch.ex19.access;

import ch.ex19.access.port.SeaPort;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 19 Complex Generic Check\n");
        SeaPort seaPort = new SeaPort(2,3,5);
        System.out.println(seaPort);
    }
}
