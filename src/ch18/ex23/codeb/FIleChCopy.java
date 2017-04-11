package ch18.ex23.codeb;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by V1 on 11-Apr-17.
 */
public class FIleChCopy {

    public static void check(String fileSrc, String fileDst) {
        final int BSIZE = 10;
        try {
            FileChannel fcIn = new FileInputStream(fileSrc).getChannel();
            FileChannel fcOut = new FileOutputStream(fileDst).getChannel();

            ByteBuffer buffer = ByteBuffer.allocate(BSIZE);
            while (fcIn.read(buffer) != -1) { // читать до завершения файла либо размера буфера
                buffer.flip(); //
                fcOut.write(buffer);    // записать полученные данные
                buffer.rewind();        // перевести назад в начало
                fcOut.write(buffer);    // повторно записать полученные данные
                buffer.clear();         // очистить буфер данных
            }

            fcIn.close();  // почему не закрывает?
            fcOut.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
