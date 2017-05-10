package ch21.ex34.codea;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

/**
 * Vadim Voronov
 * Created: 09-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Pool<T> {
    private int size;
    private List<T> items = new ArrayList<T>();
    private volatile boolean[] checkedOut;
    private Semaphore available;

    public Pool(Class<T> classObject, int size) {
        this.size = size;
        checkedOut = new boolean[size];
        available = new Semaphore(size, true);
        for (int i = 0; i < size; i++) {
            try {
                items.add(classObject.newInstance()); // Reflections
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public synchronized T getItem() {
        for (int i = 0; i < size; i++) {
            if (!checkedOut[i]) {
                checkedOut[i] = true;  // в общем сами контролируем список
                return items.get(i);
            }
        }
        return  null; // объекта не нашли, все заняты
    }

    public synchronized boolean releaseItem(T item) {
        int index = items.indexOf(item); // поискать объект в списке
        if (index == -1) {
            return false; // не нашли объект и не освободили
        }
        if (checkedOut[index]) {
            checkedOut[index] = false;
            return true;
        }
        return false; // объект не выдавали, поэтому не освободили

    }

    public void checkIn(T item) {
        if (releaseItem(item)) {
            available.release();  // освободить семафор, сдать объект
        }
    }
    public T checkOut() throws InterruptedException { // занять семафор
        available.acquire();  // если объекта нет, то здесь блокировка
        return getItem();
    }


}
