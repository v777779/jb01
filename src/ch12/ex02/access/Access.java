package ch12.ex02.access;

import java.util.ArrayList;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 2 Check\n");
        ArrayList<Integer> list = null;
        try {
            list.add(25);
        } catch (NullPointerException e) {
            System.out.println("catch called: NullPointerException");
        }


    }
}
