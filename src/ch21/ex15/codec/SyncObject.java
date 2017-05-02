package ch21.ex15.codec;

import lib.utils.Time;

/**
 * Vadim Voronov
 * Created: 02-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class SyncObject {
    public static void check() {
        final DualSync ds = new DualSync();
        new Thread() {
            @Override
            public void run() {
                ds.f(); // из параллельного потока
            }
        }.start();
        ds.g(); // из текущего потока
        Time.sleep(10);
        System.out.println();

    }

}
