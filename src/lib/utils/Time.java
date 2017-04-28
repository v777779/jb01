package lib.utils;

import java.util.concurrent.TimeUnit;

/**
 * Created by V1 on 01-Mar-17.
 */
public class Time {
    public static void sleep() {
        try {
            TimeUnit.MILLISECONDS.sleep(100); //old style Thread.sleep(100);
        } catch (Exception e) {
        }
    }

    public static void sleep(int mSec ) {
        try {
            TimeUnit.MILLISECONDS.sleep(mSec); // old style Thread.sleep(mSec);
        } catch (Exception e) {

        }
    }
}
