package ch20.ex08.codeb;

import lib.annot.AtUnitExec;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 26-Apr-17.
 */
public class CodeB {
    public static void main(String[] args) {
        app();
    }
    public static void app() {
        System.out.println("\n====CODE_B===");
        System.out.println("\n@Unit and Test Fields Check\n");

        AtUnitExec.check("out\\production\\jb01\\ch20\\ex08\\codeb\\AtUnitExample4");

    }
}
