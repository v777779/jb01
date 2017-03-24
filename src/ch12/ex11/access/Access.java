package ch12.ex11.access;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 11 RuntimeException Check\n");
        MyExClass myExClass = new MyExClass();

        try {
            myExClass.f();  // try block не нужен
        } catch (Exception e) {
            System.out.println("runtime");
        }
        System.out.println("After Runtime Exception");

        myExClass.f(); // w/o catch
    }
}
