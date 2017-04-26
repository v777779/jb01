package ch20.ex04.codec;

import lib.annot.AtUnitExec;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 20-Feb-17.
 */
public class CodeC {
    public static void main(String[] args) {
        app();
    }
    public static void app() {
        System.out.println("\n====CODE_C===");
        System.out.println("\nAssert and Exception with @Unit Check\n");
        AtUnitExec.check("out\\production\\jb01\\ch20\\ex04\\codec\\AtUnitExample2");
    }
}
