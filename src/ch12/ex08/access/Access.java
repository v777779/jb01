package ch12.ex08.access;

import lib.utils.Time;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    private static void f() throws CException {
        throw new CException("Exception from  f() ");
    }

    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 8 Throws Check\n");
        Time.sleep();
        try {
            f();
        } catch (Exception e) {
            System.err.println(e);
            System.out.println("Message:"+e.getMessage());
        }

    }
}
