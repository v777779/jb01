package ch20.ex02m.codeb;

import lib.files.JComp;

import java.io.File;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 18-Feb-17.
 */
public class CodeB {
    public static void app() {
        System.out.println("\n====CODE_B===");
        System.out.println("\nAnnotation Check\n");

        String path = "./src/ch20/ex02m/codeb/annotate/";
        new File(path+"IMultiplier.java").delete();

        JComp.compileJava("./src/ch20/ex02m/codeb/annotate","ch20.ex02m.codeb.annotate.IFEProc");
    }
}
