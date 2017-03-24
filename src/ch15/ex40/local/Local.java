package ch15.ex40.local;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nBound w Generic No Latent Check\n");

        Comm.performGeneric(new PerformDog());
        Comm.performType(new Robot());

    }
}
