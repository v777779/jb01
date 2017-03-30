package ch17.ex15.integra;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Integra {
    public static void app() {
        System.out.println("\n====INTEGRA===");
        System.out.println("\nHash Code wo hashCode() and equals() Check\n");

        System.out.println("HashMap based on Reflection:");
        SpringDetector.detect(GroundHog.class);
        System.out.println("HashMap based on Object:");
        SpringDetector.detect();

    }
}
