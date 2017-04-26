package ch20.ex08.codec;

import lib.annot.AtUnitExec;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 26-Apr-17.
 */
public class CodeC {
    public static void main(String[] args) {
        app();
    }
    public static void app() {
        System.out.println("\n====CODE_C===");
        System.out.println("\n@Unit Cleanup after Test Check\n");

        AtUnitExec.check("out\\production\\jb01\\ch20\\ex08\\codec\\AtUnitExample5");

    }
}
