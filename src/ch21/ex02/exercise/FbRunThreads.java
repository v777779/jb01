package ch21.ex02.exercise;

import java.util.Random;

/**
 * Vadim Voronov
 * Created: 27-Apr-17.
 * email: vadim.v.voronov@gmail.com
 */
public class FbRunThreads {
    public static void check() {
        Random rnd = new Random();
        for (int i = 0; i <  10; i++) {
            new Thread(new FbRun(rnd.nextInt(10)+2)).start();
        }
    }
}
