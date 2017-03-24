package ch13.ex04.include;

import java.util.Formatter;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Include {
    public static void app() {
        System.out.println("\n====INCLUDE===");
        System.out.println("\nFormat Check\n");
        Formatter f = new Formatter(System.out);

        char u ='a';
        System.out.println("u = 'a' ");
        f.format("s: %s\n",u);
//      f.format("d: %d\n",u);
        f.format("c: %c\n",u);

    }
}
