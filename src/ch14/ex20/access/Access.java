package ch14.ex20.access;

import ch14.ex20.access.shop.LuckyToy;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {

    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 20 Class  Check\n");

        ClassInfo ci = new ClassInfo(java.lang.Class.class);
        ci.getInfo();
        System.out.println("\n===============================\n");
        ci.getInfo(LuckyToy.class);

    }
}
