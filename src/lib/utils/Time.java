package lib.utils;

/**
 * Created by V1 on 01-Mar-17.
 */
public class Time {
    public static void sleep() {
        try {
            Thread.sleep(100);
        } catch (Exception e) {
        }
    }

    public static void sleep(int mSec ) {
        try {
            Thread.sleep(mSec);
        } catch (Exception e) {

        }
    }
}
