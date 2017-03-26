package ch11.ex01.local;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app() {
        System.out.println();
        System.out.println("====LOCAL====");
        System.out.println("\nCollection Different Types  Check\n");
        PackOne p = new PackOne();
        p.checkCollection();
        PackTwo p2 = new PackTwo();
        p2.checkCollection();

    }
}
