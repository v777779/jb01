package ch18.ex27.codea;

import lib.files.BFileClear;
import lib.utils.Time;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 13-Apr-17.
 */
public class CodeA {
    public static void app() {
        System.out.println("\n====CODE_A===");
        System.out.println("\nFile Locking Check\n");

        System.out.println("Simple File Lock:");
        FileLocking.check();
        System.out.println("\nMapped File Portion Lock with two Thread Objects:");
        LockingMappedFiles.check();
        Time.sleep();
        BFileClear.app("./src/ch18/ex27", "txt","tmp", "dat");

    }
}
