package ch21.ex36.exercise.restaurant;

import lib.food.Food;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Vadim Voronov
 * Created: 10-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Table implements Runnable {
    private static int counter = 0;
    private final int id = counter++;
    private WaitPerson waitPerson;
    private BlockingQueue<Plate> placeSetting = new LinkedBlockingQueue<>();
    public List<Customer> customers = Collections.synchronizedList(new  ArrayList<>()); // синхронный список
    private Restaurant restaurant;
    private OrderTicket ticket; // список заказа

    public Table(Restaurant restaurant, WaitPerson waitPerson) {  // один официант на весь столик
        this.restaurant = restaurant;
        this.waitPerson = waitPerson;
    }

     public synchronized void leavePlace(Customer customer, int place)throws InterruptedException {
        restaurant.putPlace(place);
        customers.remove(customer);
        customer.orderFood(null); // чтобы отрубить
    }

    public synchronized int getSize() {
        return  customers.size(); // чтобы отрубить
    }

    public synchronized String getList() {
        return  customers.toString(); // чтобы отрубить
    }


    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                synchronized (this) {
                    while (customers.isEmpty()) { // ждем клиентов без ресурсов
                        System.out.println(this+" waiting for customers");
                        wait();
                    }
                }
// набираем заказы
                ticket = new OrderTicket(); // новый заказ
//                StringBuilder sb = new StringBuilder();
                List<Customer> clone = new ArrayList<>(customers); // чтобы исключить модификацию в процессе работы
                for (Customer customer : clone) {
                    Food food = customer.takeFood();    // получаем по семафору
                    if(food == null) {                  // клиент закончил уходит
//                        sb.append(customer+" ");
                       continue;                         // перебрасываем
                    }
                    ticket.add(new Order(customer,waitPerson,food));
                }
                if(ticket.size() > 0 ) {
//                    System.out.println(this+" "+ticket.size() + " customers:"+clone.size()+":"+customers.size()+" formed:" +
//                                   ticket.shortString() + " "+ waitPerson.toString()+"<<"+sb.toString()+">>"+" ***");
                    System.out.println(this+"    : "+ ticket.shortString());

// отослали заказ
                    waitPerson.tickets.put(ticket); // поместили тикет
                }

            }
        } catch (InterruptedException e) {
            System.out.println(this+"interrupted");
        }

        System.out.println(this + "stop of serving");
    }

    @Override
    public String toString() {
        return "Table " + id + " ";
    }
}
