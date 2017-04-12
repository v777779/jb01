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
            ByteBuffer bb = ByteBuffer.allocate(BSIZE);
// способ 3
            bb.asCharBuffer().put(stringData);  // записать через charBuffer
            fc.write(bb);                       // записать кодированные данные
            fc.close();

            fc = new FileInputStream(fileWrite).getChannel(); // получить записанный файл в виде потока
            fc.read(bb);
            bb.flip();
            System.out.print(bb.asCharBuffer().toString());
            System.out.println(bb.asCharBuffer().length());
            CharBuffer ch = bb.asCharBuffer().subSequence(0,bb.asCharBuffer().toString().indexOf("\u0000"));
            System.out.print(ch);
            System.out.println(ch.length());
            fc.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
