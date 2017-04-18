package ch18.ex22.codea;

import lib.utils.TextFile;

import java.io.PrintWriter;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 10-Apr-17.
 */
public class CodeA {
    public static void app() {
        System.out.println("\n====CODE_A===");
        System.out.println("\nSystem Out Stream Check\n");
        PrintWriter  pw = new PrintWriter(System.out,true); // авто сброс
        pw.println("Hello world");
        pw.println("Data from String");

        String text = TextFile.read("./src/ch18/ex22/Ex22.java");
        System.out.println("\nText File out:");
        System.out.println("-----------------------------");
        pw.print(text.replaceAll("(p[au].+\\W+)|([/ ]\\W+)|([CE].+)",""));
        pw.flush();
        System.out.println("-----------------------------");

    }
}
