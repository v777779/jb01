package ch15.ex25.access;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static <T extends IWater> void getR1(T p) {
        p.water();
    }

    public static <T extends IGas> void getR2(T p) {
        p.gas();
    }

    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise Bounds 25 Check\n");
        Provider p = new Provider();
        getR1(p);
        getR2(p);
    }
}
