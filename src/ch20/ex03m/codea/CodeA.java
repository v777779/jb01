package ch20.ex03m.codea;

import lib.files.JComp;
import lib.system.OSExecute;

import java.io.File;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 20-Feb-17.
 */
public class CodeA {
    public static void app() {
        System.out.println("\n====CODE_A===");
        System.out.println("\njavac Annotation Processor Check\n");
//javac call Imultiplier
        System.out.println("Javac Call IMultiplier");
        System.out.println("-------------------------------------------");
        String path = "./src/ch20/ex03m/codea/annotate/";
        String processor = "ch20.ex03m.codea.annotate.IFEProc";
        new File(path+"IMultiplier.java").delete();
        JComp.compileJava(path,processor);
//batch call Visitor
        System.out.println("\nBatch Call Visitor Pattern");
        System.out.println("-------------------------------------------");
        OSExecute.command("cmd /c cd src\\ch20\\ex03m\\codea & j4.cmd");

//javac call Visitor
        System.out.println("\nJavac Call Visitor Pattern");
        System.out.println("-------------------------------------------");
        path = "./src/ch20/ex03m/codea/dbase/";
        processor = "ch20.ex03m.codea.dbase.TCPFactory";
        JComp.compileJava(path,processor,"M.*.java");  // all files in the path


    }
}
