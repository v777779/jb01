package ch18.ex27.codeb;

import lib.files.Catalog;

import java.io.File;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 18-Feb-17.
 */
public class CodeB {
    public static void app(String[] args) {
        System.out.println("\n====CODE_B===");
        System.out.println("\nGZIP Compress Check\n");

        GZIPCompress.check(args);  // байтовый, символьный, строчный ввод, вывод работают
        ZipCompress.check(args);   // байтовый, символьный, строчный ввод, вывод работают


        File[] files = Catalog.local("./src/ch18/ex27/codeb/archives",".*");
        for (File file : files) {
            file.delete();
        }
        files = Catalog.local("./src/ch18/ex27/codeb/",".*.[gz][iz].*");
        for (File file : files) {
            System.out.println(file.getName());
            file.renameTo(new File(file.getParent()+"\\archives\\"+file.getName()));
        }







    }
}
