package lib.files;

import java.io.File;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 13-Apr-17.
 */
public class BFileClear {
    public static void app(String filePath) {

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        File[] files = Catalog.walk(filePath).getListFiles().toArray(new File[0]);
        System.out.println("Clear temp file started:");
        System.gc();
        for (File file : files) {
            String path = file.getPath();
            if (path.endsWith(".txt") || path.endsWith(".tmp") || path.endsWith(".dat")) {
                file.delete();
            }
            System.out.printf("%-25s: done\n", file.getName());
        }
        System.out.println("Clear done...");
    }
}
