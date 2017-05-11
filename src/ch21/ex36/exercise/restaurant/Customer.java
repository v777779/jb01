package ch21.ex36.exercise.restaurant;

import lib.food.Course;
import lib.food.Food;

import java.util.concurrent.Semaphore;
import java.util.concurrent.SynchronousQueue;

/**
 * Vadim Voronov
 * Created: 10-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Customer implements Runnable {
    private static int counter = 0;
    private final int id = counter++;
    private SynchronousQueue<Plate> placeSetting = new SynchronousQueue<>();
    private Semaphore readyToOrder = new Semaphore(1); // один заказ
    private Food foodToOrder;

    private final int place;
    private final Table table;

    public Customer(Table table, int place) {
        this.table = table;
        this.place = place;
        try {
            readyToOrder.acquire();
        } catch (InterruptedException e) {
            System.out.println(this + " interrupted constructor");
            ;
        }
    }

    // нельзя делать sync сюда не попадет т.к. семафор держит объект
    public void orderFood(Food food) {  // сюда не пускает
        foodToOrder = food;
        readyToOrder.release();
    }

    // нельзя делать sync т.к. семафор заблокирует объект
    public Food takeFood() throws InterruptedException {
        readyToOrder.acquire();  // объект заблокирован здесь по семафору
        return foodToOrder;      // сюда не попадет раньше назначения благодаря семафору
    }

    public void deliver(Plate p) throws InterruptedException {
        placeSetting.put(p);
    }

    public String getTable() {
        return table.toString();
    }

// несколько объектов сразу ждем пока все отстреляются потом врубаем заказ

    @Override
    public void run() {
        try {
            for (Course course : Course.values()) {
                Food food = course.randomSelection();
                orderFood(food); // заказали еду
                Plate plate = placeSetting.take(); // собственно здесь ожидание
                System.out.println(this + "eating " + plate);
            }// for
            table.leavePlace(this, place); // освободить столик, удалить себя из списка клиентов
            System.out.println(this + "finished meal, leaving " + table + "remained:" + table.getSize() + " " + table.getList());
        } catch (InterruptedException e) {
            System.out.println(this + "interrupted");
        }
        System.out.println(this + "leaved restaurant");
    }

    @Override
    public String toString() {
        return "Customer " + id + " ";
    }
}
