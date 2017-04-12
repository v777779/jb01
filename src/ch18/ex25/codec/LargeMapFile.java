package ch18.ex25.codec;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 12-Apr-17.
 */
public class LargeMapFile {
    private static int length = 0x7FFFFFF; // 128Mb
    public static void check() {
        try {

            System.out.println("File writing started:");
            MappedByteBuffer mbb = new RandomAccessFile("./src/ch18/ex25/codec/test.dat", "rw").
                    getChannel().map(FileChannel.MapMode.READ_WRITE, 0, length);
            System.out.println("file length:"+length);
            for (int i = 0; i < length ; i++) {
                mbb.put((byte)'x');
            }
            System.out.println("File written");
            System.out.print("File data:");
            for (int i = length/2; i < length/2+10; i++) {
                System.out.print((char)mbb.get(i)+" ");
            }
            System.out.println();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
