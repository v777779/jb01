package ch18.ex24.codea;


import lib.files.BFileParser;
import lib.files.Catalog;

import java.io.File;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 11-Apr-17.
 */
public class CodeA {
    public static void app() {
        System.out.println("\n====CODE_A===");
        System.out.println("\n Check\n");

           BFileParser.check("./src/ch18/ex23/Ex23.java");

        String s = "D:\\_lessons\\java\\[]_sandbox\\jb01\\src\\ch18\\ex23\\codea\\";

        //String regex = "(\\[\\w]*|[\\W]*)+Code[\\p{Upper}].java";
        String regex = ".*((Code[\\p{Upper}])|(Exercise)).java";


        System.out.println((s+"CodeA.java").replaceAll(regex,"&"));
        System.out.println((s+"CodeB.java").replaceAll(regex,"&"));
        System.out.println((s+"CodeC.java").replaceAll(regex,"&"));
        System.out.println((s+"CodeD.java").replaceAll(regex,"&"));
        System.out.println((s+"CodeE.java").replaceAll(regex,"&"));
        System.out.println((s+"CodeF.java").replaceAll(regex,"&"));
        System.out.println((s+"CodeG.java").replaceAll(regex,"&"));
        System.out.println((s+"CodeH.java").replaceAll(regex,"&"));
        System.out.println((s+"Exercise.java").replaceAll(regex,"&"));

        String path = "./src/ch18/ex23/";
        List<File> list = Catalog.walk(path, ".*.java").getListFiles();

        for (File file : list) {
            Pattern p = Pattern.compile(regex);
            System.out.println(file.getAbsolutePath()+": "+p.matcher(file.getAbsolutePath()).matches());
            System.out.println(BFileParser.isExercise(file.getAbsolutePath()));
        }

//        Pattern p = Pattern.compile(regex);
//        Matcher matcher =  p.matcher(s);
//        while (matcher.find()) {
//            String s2 = matcher.group();
//            System.out.println(s2);
//        }
    }
}
