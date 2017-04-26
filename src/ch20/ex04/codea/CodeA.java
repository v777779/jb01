package ch20.ex04.codea;

import lib.units.atunit.AtUnit;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 20-Feb-17.
 */
public class CodeA {
    public static void check() {
        try {
            String[] args = new String[]{
                    "out\\production\\jb01\\ch20\\ex04\\codea\\AtUnitExample1"
            };
            AtUnit.main(args);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        app();
    }
    public static void app() {
        System.out.println("\n====CODE_A===");
        System.out.println("\n@Unit Check\n");

        System.out.println("\nAtUnitTest Result:");
        check();
    }
}
