package ch.ex29.local;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nGeneric Mask<?> Check\n");
        Unbound u = new Unbound();
        u.app();
        Unbound2 u2 = new Unbound2();
        u2.app();

    }
}
