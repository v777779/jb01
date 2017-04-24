package ch20.ex02m.codea;

import lib.system.OSExecute;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 24-Apr-17.
 */
public class CodeA {
    public static void app() {
        System.out.println("\n====CODE_A===");
        System.out.println("\njavac  Annotation Processing Check\n");
        OSExecute.command("cmd /c cd src\\ch20\\ex02m\\codea & j4.cmd");

    }
}
