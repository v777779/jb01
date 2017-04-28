package ch21.ex05.exercise;

import lib.utils.Fibonacci;

import java.util.Random;
import java.util.concurrent.Callable;

/**
 * Vadim Voronov
 * Created: 27-Apr-17.
 * email: vadim.v.voronov@gmail.com
 */
public class FbCall implements Callable<Integer> {
    private static int counter = 0;
    private final int id = counter++;
    private int n;
    private static final int RANGE = 5;
    private static final int LIMIT = 5;
    private static Random rnd = new Random();

    public FbCall() {
        n = rnd.nextInt(RANGE)+LIMIT;
    }

    public FbCall(int n) {
        this.n = n;
    }

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        Fibonacci f = new Fibonacci();
        for (int i = 0; i < n; i++) {
           sum += f.next();
        }
        System.out.println("#" + id + "." + f.next());
        Thread.yield(); // освобождаем ресурсы
        return sum;
    }
}
