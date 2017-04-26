package ch20.ex03.codea;

import lib.system.OSExecute;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 24-Apr-17.
 */
public class CodeA {
    private int valInt =  15;
    private String  nameS =  "CodeA String Value";
    public static void app() {
        System.out.println("\n====CODE_A===");
        System.out.println("\nAnnotation Pattern Visitor Check\n");
        Message.show();
        OSExecute.command("cmd /c .\\src\\ch20\\ex03\\codea\\j.cmd");

    }
}
