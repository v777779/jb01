package ch13.ex02.local;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {

    @Override
    public String toString() {
        return "Local{}"+this;   // место возникновения рекурсии
//        return "Local{}"+super.toString();   // место возникновения рекурсии
    }

    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nUnintended Recursion toString Check\n");
        Local local = new Local();
//        String s = local.toString();   // место возникновения рекурсии
//        System.out.println(s);

    }
}
