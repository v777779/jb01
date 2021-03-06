package ch18.ex23.codec;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 11-Apr-17.
 */
public class BufferToText {
    private static final int BSIZE = 1024;
    private static String stringData = "FileChannel fc = Русские символы new FileOutputStream(fileWrite).getChannel()";

    public static void check(String fileWrite) {
        try {
            FileChannel fc = new FileOutputStream(fileWrite).getChannel();
            fc.write(ByteBuffer.wrap((stringData).getBytes())); // прочитать файл в строку, получить байты
            fc.close();
            fc = new FileInputStream(fileWrite).getChannel(); // получить записанный файл в виде потока
            ByteBuffer bb = ByteBuffer.allocate(BSIZE);
// попытка вывода  asCharBuffer()
            fc.read(bb); // прочитать всю строку с гарантией
            bb.flip(); // подготовить к чтению
            System.out.println("byte[] write.default() read.asCharBuffer():");
            System.out.println(bb.asCharBuffer());  // просто вывести как массив  выдает фигню

// способ 1 with Charset.decode()
            bb.rewind(); // вернуть указатель на начало
            String charset = System.getProperty("file.encoding");
            System.out.println("\nbyte[] write.default() read.Charset(" + charset + ").decode:");
            System.out.println(Charset.forName(charset).decode(bb));

// способ 2 with write encoded(UTF-16) data
            fc = new FileOutputStream(fileWrite).getChannel();  // write channel
            fc.write(ByteBuffer.wrap((stringData).getBytes("UTF-16")));// записать кодированные данные
            fc.close();

            fc = new FileInputStream(fileWrite).getChannel(); // получить записанный файл в виде потока
            bb.clear();
            fc.read(bb);
            bb.flip();
            System.out.println("\nbyte[] write.getbytes(UTF-16BE) read.asCharBuffer():");
            System.out.println(bb.asCharBuffer());
// способ 3
            fc = new FileOutputStream(fileWrite).getChannel();  // write channel
            bb = ByteBuffer.allocate(stringData.length()*2+20);    // в размер данных по 2 байта на символ
            bb.asCharBuffer().put(stringData);  // записать через charBuffer
            fc.write(bb);                       // записать кодированные данные
            fc.close();

            fc = new FileInputStream(fileWrite).getChannel(); // получить записанный файл в виде потока
            fc.read(bb);
            bb.flip();
            System.out.println("\nbyte[] write.asCharBuffer() read.asCharBuffer():");
            System.out.println(bb.asCharBuffer());

            fc.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
