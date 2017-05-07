package ch21.ex24.exercise.office;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Vadim Voronov
 * Created: 07-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class FlowQueue <T>{
    private Queue<T> queue = new LinkedList<T>();
    private int maxSize;

    public FlowQueue(int maxSize) {
        this.maxSize = maxSize;
    }
    public synchronized void put(T v) throws InterruptedException {
        while (queue.size() >= maxSize) {
            System.out.println("maxsize wait");
            wait();
        }
        queue.offer(v); // добавить элемент в очередь
        notifyAll();
    }

    public synchronized T get() throws InterruptedException {
        while (queue.isEmpty()) {
            System.out.println("empty wait");
            wait();
        }
        T returnVal = queue.poll(); // вытащить и удалить
        notifyAll();
        return returnVal;
    }

    public int getMaxSize() {
        return maxSize;
    }
}
