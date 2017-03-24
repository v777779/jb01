package ch13.ex02.access;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    @Override
    public String toString() {
//        return "Local{}"+this;   // место возникновения рекурсии
        return "Acess{}"+super.toString();   // место возникновения рекурсии
    }

    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 2 toString Recursion Check\n");
        Access access = new Access();
        String s = access.toString();   // место возникновения рекурсии
        System.out.println(s);

    }
}
