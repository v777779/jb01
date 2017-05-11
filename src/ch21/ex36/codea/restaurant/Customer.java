package ch21.ex36.codea.restaurant;

import lib.food.Course;
import lib.food.Food;

import java.util.concurrent.SynchronousQueue;

/**
 * Vadim Voronov
 * Created: 10-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Customer implements Runnable {
    private static int counter = 0;
    private final int id = counter++;
    private WaitPerson waitPerson;
    private SynchronousQueue<Plate> placeSetting = new SynchronousQueue<>();

    public Customer(WaitPerson waitPerson) {
        this.waitPerson = waitPerson;
    }

    public void deliver(Plate p) throws InterruptedException {
        placeSetting.put(p);
    }

    public SynchronousQueue<Plate> deliverCheck() throws InterruptedException {
        return placeSetting;
    }

    @Override
    public void run() {
        for (Course course : Course.values()) {
            Food food = course.randomSelection();
            try {
                waitPerson.placeOrder(this, food);
                System.out.println(this+"eating "+placeSetting.take());
            } catch (InterruptedException e) {
                System.out.println(this+"waiting for "+
                       course+ " interrupted");
                break;
            }
        }// for
        System.out.println(this+"finished meal, leaving");
    }

    @Override
    public String toString() {
        return "Customer " +id +" ";
    }
}
