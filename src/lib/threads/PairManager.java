package lib.threads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Vadim Voronov
 * Created: 02-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public abstract class PairManager {
    private static boolean requestExit = false;
    protected AtomicInteger checkCounter = new AtomicInteger(0);
    protected Pair p = new Pair(); // значения по умолчанию 0,0
    private List<Pair> storage = Collections.synchronizedList(new ArrayList<>()); // ага создается защищенный список

    public synchronized Pair getPair() {
        return new Pair(p.getX(), p.getY()); // создается копия
    }

    protected void store(Pair p) {
        storage.add(p); // добавить в синхронный список элемент
        try {
            TimeUnit.MILLISECONDS.sleep(50); // типа долгая операция
        } catch (InterruptedException e) {
            System.out.println("interrupted");
        }
    }

    public abstract void increment(); // реализация в потомках   не может быть sync здесь

    public synchronized static boolean state() {
        return requestExit;
    }

    public synchronized static void set() {
        requestExit = true;
    }

    public synchronized static void reset() {
        requestExit = false;
    }

}
