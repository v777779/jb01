package ch21.ex36.codea.restaurant;

import lib.food.Food;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 10-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Chef implements Runnable {
    private static int counter = 0;
    private final int id = counter++;
    private final Restaurant restaurant;
    private Random rnd = new Random();

    public Chef(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                Order order = restaurant.orders.take();     // получить заказ из очереди
                Food requestedItem = order.item();          // блюдо в заказе
                TimeUnit.MILLISECONDS.sleep(rnd.nextInt(500));// время на приготовление
                Plate plate = new Plate(order,requestedItem);       // блюдо и заказ
                order.getWaitPerson().filledOrders.put(plate);      // навесить официанту блюдо
            }
        } catch (InterruptedException e) {
            System.out.println(this+" interrupted");
        }
        System.out.println(this + " off duty");
    }

    @Override
    public String toString() {
        return "Chef " + id + " ";
    }
}
