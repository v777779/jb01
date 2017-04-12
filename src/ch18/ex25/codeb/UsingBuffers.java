package ch18.ex25.codeb;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 12-Apr-17.
 */
public class UsingBuffers {
    private static void scrambler(CharBuffer cb) {
        while (cb.hasRemaining()) {
            cb.mark();   // пометить позицию
            char c1 = cb.get();
            char c2 = cb.get();
            cb.reset();  // вернуться к отмеченной позиции
            cb.put(c2);  // всегда возвращается к последней
            cb.put(c1);  // помеченной позиции
        }
    }

    public static void check() {

        char[] charData = "UsingBuffers".toCharArray();
        ByteBuffer bb = ByteBuffer.allocate(charData.length * 2); // по 2 байта на символ
        CharBuffer cb2 = bb.asCharBuffer();
        CharBuffer cb = CharBuffer.wrap(charData);
        //cb.put(charData); // записать данные в представление

        System.out.println("cb initial  :" + cb.rewind());
        scrambler(cb);
        System.out.println("cb scrambled:" + cb.rewind());
        scrambler(cb);
        System.out.println("cb restored :" + cb.rewind());

        String fileName = "./src/ch18/ex25/codeb/CharBuffer.txt";
        try {
            FileChannel fc = new FileOutputStream(fileName).getChannel();
            bb = ByteBuffer.allocate(cb.length() * 2);
            for (cb.rewind(); cb.hasRemaining(); ) {
                bb.putChar(cb.get());
            }
            bb.flip();
            fc.write(bb);
            fc.close();
            fc = new FileInputStream(fileName).getChannel();
            bb = ByteBuffer.allocate((int) fc.size());
            fc.read(bb);
            bb.flip();
            System.out.println("from file   :" + bb.asCharBuffer());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
