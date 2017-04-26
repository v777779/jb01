package ch20.ex08.coded;

import lib.annot.AtUnitExec;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 26-Apr-17.
 */
public class CodeD {
    public static void main(String[] args) {
        app();
    }
    public static void app() {
        System.out.println("\n====CODE_D===");
        System.out.println("\n@Unit with Generic Test Check\n");

        AtUnitExec.check("out\\production\\jb01\\ch20\\ex08\\coded\\StackLStringTest");

    }
}
