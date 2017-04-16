package ch18.ex27.codea;

import java.io.FileOutputStream;
import java.nio.channels.FileLock;
import java.util.concurrent.TimeUnit;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 13-Apr-17.
 */
public class FileLocking {
    public static void check() {
        String fileName = "./src/ch18/ex27/codea/TestData.txt";
        try {
            FileOutputStream fs = new FileOutputStream(fileName);
            FileLock fl = fs.getChannel().tryLock(); // попытка заблокировать файл на доступ
            if (fl != null) {
                System.out.println("File Locked");
                TimeUnit.MILLISECONDS.sleep(100);
                fl.release(); // освободить файл
                System.out.println("File unlocked");
            }

            fl.close();
            fs.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
