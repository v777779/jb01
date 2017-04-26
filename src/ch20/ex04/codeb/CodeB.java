package ch20.ex04.codeb;

import lib.annot.AtUnitExec;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 18-Feb-17.
 */
public class CodeB {
    public static void main(String[] args) {
        app();
    }

    public static void app() {
        System.out.println("\n====CODE_B===");
        System.out.println("\n@Unit Inheritance and Compositon Check\n");

        System.out.println("@Unit Inheritance Test:");
        AtUnitExec.check("out\\production\\jb01\\ch20\\ex04\\codeb\\AtUnitExternalTest");

        System.out.println("\n@Unit Composition Test:");
        AtUnitExec.check("out\\production\\jb01\\ch20\\ex04\\codeb\\AtUnitCompositon");

    }
}
