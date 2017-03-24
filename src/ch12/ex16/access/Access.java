package ch12.ex16.access;

import lib.shapes.CADSystem;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void f() {
        System.out.println("\ncad.inint():\n");
        CADSystem cad = new CADSystem(15);

        try {
            System.out.println("f() return from try");
            return;


        } catch (Exception e) {

        }finally {
            System.out.println("\ncad.dispose():\n");
            cad.dispose();  // по любому отрубить
        }

    }

    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 16 Finally vs Return Check\n");
        f();
    }
}
