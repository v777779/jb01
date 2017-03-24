package ch05.ex20;

/**
 * Created by V1 on 06-Feb-17.
 */
public class Ex20 {
    public static void main(String... args) {

        if (args != null && args.length > 0) {
            System.out.println("\nMain arguments list: ");
            int i = 0;
            for (String arg : args) {
                System.out.println("arg" + i++ + ": " + arg);
            }
        }

    }
}
