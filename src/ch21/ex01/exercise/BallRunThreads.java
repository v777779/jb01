package ch21.ex01.exercise;

/**
 * Vadim Voronov
 * Created: 27-Apr-17.
 * email: vadim.v.voronov@gmail.com
 */
public class BallRunThreads {
    public static void check() {
        Thread[] t = new Thread[10];
        for (int i = 0; i < t.length ; i++) {
             t[i] = new Thread(new BallRun());
             t[i].start();
        }
    }
}
