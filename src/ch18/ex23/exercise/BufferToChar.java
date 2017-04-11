package ch18.ex23.exercise;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 11-Apr-17.
 */
public class BufferToChar {
    private static final int BSIZE = 250;
    private static String stringData = "FileChannel fc = Русские символы New FileOutputStream(fileWrite).getChannel()";

    public static void check(String fileWrite) {
        try {
            FileChannel fc = new FileOutputStream(fileWrite).getChannel();
            ByteBuffer bf = ByteBuffer.allocate(BSIZE);
// способ 3
            bf.asCharBuffer().put(stringData);  // записать через charBuffer
            fc.write(bf);                       // записать кодированные данные
            fc.close();

            fc = new FileInputStream(fileWrite).getChannel(); // получить записанный файл в виде потока
            fc.read(bf);
            bf.flip();
            System.out.print(bf.asCharBuffer().toString());
            System.out.println(bf.asCharBuffer().length());
            CharBuffer ch = bf.asCharBuffer().subSequence(0,bf.asCharBuffer().toString().indexOf("\u0000"));
            System.out.print(ch);
            System.out.println(ch.length());
            fc.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
