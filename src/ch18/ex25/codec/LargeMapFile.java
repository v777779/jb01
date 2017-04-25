package ch18.ex25.codec;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 12-Apr-17.
 */
public class LargeMapFile {
    private static int length = 0x7FFFFFF; // 128Mb
    public static void check() {
        String fileName = "./src/ch18/ex25/codec/test.dat";
        try {

            System.out.println("File writing started:");
            FileChannel fc = new RandomAccessFile(fileName, "rw").getChannel();
            MappedByteBuffer mbb = fc.map(FileChannel.MapMode.READ_WRITE, 0, length);
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
// ВНИМАНИЕ ОСВОБОЖДЕНИЕ mapped memory file
            fc.close();
            mbb=null;
            System.gc();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        new File(fileName).delete();
    }
}
