package ch12.ex10.access;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 10 Exception Check\n");
        MyExClass myExClass = new MyExClass();


        try {
            myExClass.f();
        } catch (MyExTwo e) {
            System.out.println("catch:"+e);
        }

    }
}
