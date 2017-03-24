package ch.ex32.local;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nCast InstanceOf and Generic Check\n");
        FixedSizeStack.stackTest();
        NeedCasting.castTest();
    }
}
