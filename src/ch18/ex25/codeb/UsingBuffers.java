package ch18.ex25.codeb;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 12-Apr-17.
 */
public class UsingBuffers {
    private static void scrambler(CharBuffer cb) {
        while (cb.hasRemaining()) {
           cb.mark(); // пометить позицию
            System.out.println(cb.position());
            char c1 = cb.get();
            char c2 = cb.get();
            System.out.println(cb.position());
            cb.reset();
            System.out.println(cb.position());
            cb.put(c2);
            cb.put(c1);
            System.out.println(cb.position());
        }
    }
    public static void check() {

        char[] charData = "UsingBuffers".toCharArray();
        ByteBuffer bb = ByteBuffer.allocate(charData.length*2); // по 2 байта на символ
        CharBuffer cb =
    }

}
