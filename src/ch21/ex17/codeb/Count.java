package ch21.ex17.codeb;

import java.util.Random;

/**
 * Vadim Voronov
 * Created: 03-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Count {
    private int count = 0;
    private Random rnd = new Random();

    public synchronized int increment() {   // для проверки удалить synchronized
        int temp = count;
        if (rnd.nextBoolean()) {            // случайно отдаем управление
            Thread.yield();
        }
        return count = ++temp;              // вот такой хитрый инкремент

    }
    public synchronized int value() {  // не так обязательно
        return count;
    }
}
