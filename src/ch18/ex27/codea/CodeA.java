package ch18.ex27.codea;

import lib.files.BFileClear;
import lib.utils.Time;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 20-Feb-17.
 */
public class CodeA {
    public static void app() {
        System.out.println("\n====CODE_A===");
        System.out.println("\nFile Locking Check\n");

        // remove to run programm   блокировка чтобы не писало файлы
        int k = 0;
        if (k == 0) {
            return;
        }
        // remove to run programm   блокировка чтобы не писало файлы

        System.out.println("Simple File Lock:");
        FileLocking.check();
        System.out.println("\nMapped File Portion Lock with two Thread Objects:");
        LockingMappedFiles.check();
        Time.sleep();
        BFileClear.app("./src/ch18/ex27", "txt","tmp", "dat");

    }
}
