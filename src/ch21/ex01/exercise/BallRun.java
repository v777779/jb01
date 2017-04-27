package ch21.ex01.exercise;

/**
 * Vadim Voronov
 * Created: 27-Apr-17.
 * email: vadim.v.voronov@gmail.com
 */
public class BallRun implements Runnable {
    private static int counter = 0;
    private final int id = counter++;
    public BallRun() {
        System.out.println("#"+id+".started ");
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("#"+id+"." + i+" ");
            Thread.yield();
        }

        System.out.println("#"+id+".finished ");
    }


}
