package ch18.ex27.codea;

import lib.utils.Time;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;


/**
 * Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 13-Apr-17.
 */
public class LockingMappedFiles {
    static final int LENGTH = 0x7FFFFFF; //
    static FileChannel fc;
    private static String fileName = "./src/ch18/ex27/codea/test.dat"; // огромный файл по идее

    private static class LockAndModify extends Thread {
        private ByteBuffer buff;
        private int start, end;

        public LockAndModify(ByteBuffer bb, int start, int end) {
            this.start = start;
            this.end = end;
            bb.limit(end);              // финальная позиция для внешнего буфера
            bb.position(start);         // текущая позицию внешнего буфера
            this.buff = bb.slice();     //
            start();                    // запуск процесса
        }

        public void run() {
            try {
                FileLock fl = fc.lock(start, end, false);
                System.out.println("Locked  :" + start + " to " + end);
                while (buff.position() < buff.limit() - 1) {  // прокачать местный буффер куда было отображение
                    buff.put((byte) (buff.get() + 1)); // заменить символы в локальном буфере
                }
                fl.release();  // разблокировать
                System.out.println("Released:" + start + " to " + end);
                fl.close();
                buff = null;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void check() {
        try {
            fc = new RandomAccessFile(fileName, "rw").getChannel();
            System.out.print("Mapped Buffer filling ...");
            MappedByteBuffer mb = fc.map(FileChannel.MapMode.READ_WRITE, 0, LENGTH);
            for (int i = 0; i < LENGTH; i++) {
                mb.put((byte) 'x');
            }
            System.out.println("done.");
            LockAndModify p1 = new LockAndModify(mb, 0, 0 + LENGTH / 3);           // 0..1/3     obj.start().run()
            LockAndModify p2 = new LockAndModify(mb, LENGTH / 2, LENGTH / 2 + LENGTH / 4); // 1/2..3/4   obj.start().run()
            while (p1.isAlive() || p2.isAlive()) {
                Time.sleep(1);
            //    System.out.print(".");

            }
            System.out.println("processes are finished...");
            fc.close();     // ВНИМАНИЕ НЕ ЗАКРЫВАТЬ БУФЕР ДО ЗАВЕРШЕНИЯ РАБОТЫ С НИМ
            mb = null;      // обязательно для удаления файла
            System.gc();    // обязательно для удаления файла
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
