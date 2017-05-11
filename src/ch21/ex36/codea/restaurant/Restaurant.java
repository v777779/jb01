package ch21.ex36.codea.restaurant;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 10-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Restaurant implements Runnable {
    private List<WaitPerson> waitPersons = new ArrayList<>();
    private List<Chef> chefs = new ArrayList<>();
    private ExecutorService exec;
    private static Random rnd = new Random();

    public BlockingQueue<Order> orders = new LinkedBlockingQueue<>();

    public Restaurant(ExecutorService exec, int nWaitPersons, int nChefs) {
        this.exec = exec;
        for (int i = 0; i < nWaitPersons; i++) {
            WaitPerson waitPerson = new WaitPerson(this);
            waitPersons.add(waitPerson);
            exec.execute(waitPerson);
        }

        for (int i = 0; i < nChefs; i++) {
            Chef chef = new Chef(this);
            chefs.add(chef);
            exec.execute(chef);
        }
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                WaitPerson waitPerson = waitPersons.get(rnd.nextInt(waitPersons.size())); // взять случайного официанта
                Customer customer = new Customer(waitPerson); // назначить ему клиента
                exec.execute(customer);
                TimeUnit.MILLISECONDS.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println("Restaurant interrupted");
        }
        System.out.println("Restaurant closing");
    }
}
