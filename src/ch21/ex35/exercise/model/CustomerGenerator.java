package ch21.ex35.exercise.model;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 10-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class CustomerGenerator implements Runnable {
    private CustomerLine customers;
    private static Random rnd= new Random();

    public CustomerGenerator(CustomerLine customers) {
        this.customers = customers;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                TimeUnit.MILLISECONDS.sleep(rnd.nextInt(300)); // частота новых клиентов случайна
                customers.put(new Customer(rnd.nextInt(1000)));// время обслуживания случайно
            }
        } catch (InterruptedException e) {
            System.out.println("CustomerGenerator interrupted");
        }
        System.out.println("CustomerGenerator finished");
    }
}
