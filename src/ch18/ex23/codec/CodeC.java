package ch18.ex23.codec;

import lib.files.BFileWrite;

import java.util.List;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 10-Apr-17.
 */
public class CodeC {
    public static void app() {
        System.out.println("\n====CODE_C===");
        System.out.println("\nEncode FileChannel Check\n");
        BufferToText.check("./src/ch18/ex23/coord/CodeC.txt");
        List<String> list = GetCharsets.getCharset();
        BFileWrite.writeList(list,"./src/ch18/ex23/coord/CharSets.txt");
        System.out.println(list.size()+" charsets in CharSets.txt");

    }
}