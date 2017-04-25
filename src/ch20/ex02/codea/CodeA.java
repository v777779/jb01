package ch20.ex02.codea;

import ch20.ex02.codea.annotate.message;
import lib.system.OSExecute;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 20-Apr-17.
 */
public class CodeA {
    public static void app() {
        System.out.println("\n====CODE_A===");
        System.out.println("\napt Annotation Processing Check\n");
        message.show();
        OSExecute.command("cmd /c cd .\\src\\ch20\\ex02\\codea & j.cmd");
    }
}
