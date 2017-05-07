package ch21.ex24.exercise;

import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Vadim Voronov
 * Created: 07-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Plant {
    public Producer producer;
    public Consumer consumer;
    public  LinkedList<Item> items = new LinkedList<>(); // очередь объектов
    public boolean itemReady = false;  // не готово
    ExecutorService exec;

    public Plant() {
        producer = new Producer(this);
        consumer = new Consumer(this);
        exec = Executors.newCachedThreadPool();
        exec.execute(producer);
        exec.execute(consumer);
    }

    public synchronized void put(Item item) {  // синхронизация идет по данному объекту
        items.addFirst(item);

    }
    public synchronized Item get() {            // синхронизация идет по данному объекту
        return items.removeLast();
    }

    public static void check() {
        new Plant();
    }



}
