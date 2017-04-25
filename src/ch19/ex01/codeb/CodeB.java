package ch19.ex01.codeb;

import static ch19.ex01.codeb.Spiciness.*;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 17-Apr-17.
 */
public class CodeB {
    public static void app() {
        System.out.println("\n====CODE_B===");
        System.out.println("\nStatic import enum.* Check\n");

        System.out.println("import static ch19.ex01.codeb.Spiciness.*");
        System.out.println(new Burrito(NOT));
        System.out.println(new Burrito(MEDIUM));
        System.out.println(new Burrito(HOT));

    }
}
