package ch21.ex36.exercise.restaurant;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 10-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class WaitPerson implements Runnable {
    private static int counter = 0;
    private final int id = counter++;
    private final Restaurant restaurant;
    public BlockingQueue<Plate> filledOrders = new LinkedBlockingQueue<>();
    public BlockingQueue<OrderTicket> tickets = new LinkedBlockingQueue<>();

    public WaitPerson(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

//    public void placeOrder(Customer customer, Food food) {
//        try {
//            Order order = new Order(customer, this, food);
//            restaurant.orders.put(order);
//        } catch (InterruptedException e) {
//            System.out.println(this + " placeOrder interrupted");
//        }
//    }

    @Override
    public void run() {
        try {
            System.out.println(this + " started");
            while (!Thread.interrupted()) {
                OrderTicket ticket = tickets.poll(10, TimeUnit.MILLISECONDS); // ждем или забираем
                if (ticket != null) {
                    restaurant.orders.put(ticket);
                }
                Plate plate = filledOrders.poll(10, TimeUnit.MILLISECONDS); // взять счет
                if (plate != null) {
                    System.out.println(this + ": received " + plate + " delivering to  " +
                            plate.getOrder().getCustomer()+" "+plate.getOrder().getCustomer().getTable());
                    plate.getOrder().getCustomer().deliver(plate); // официант размещает тарелку на столе клиента
                }
            }
        } catch (InterruptedException e) {
            System.out.println(this + " interrupted");
        }
        System.out.println(this + " off duty");  // официант
    }

    @Override
    public String toString() {
        return "WaitPerson " + id ;
    }
}
