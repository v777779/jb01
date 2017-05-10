package ch21.ex35.exercise.model;

import lib.utils.Time;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 10-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class BankTellerSimulation {
    static final int MAX_LINE_SIZE = 50;
    static final int MAX_SERVERS = 10;
    static final int ADJUSTMENT_PERIOD = 200; // ms

    public static void check() {
        ExecutorService exec = Executors.newCachedThreadPool();
        CustomerLine customers = new CustomerLine(MAX_LINE_SIZE);
        exec.execute(new CustomerGenerator(customers)); // запустить генератор клиентов
        exec.execute(new ServerManager(exec, customers, MAX_SERVERS, ADJUSTMENT_PERIOD));

        try {
            TimeUnit.MILLISECONDS.sleep(10000);

//            System.out.println("Press 'Enter' to quit ");
//            System.in.read();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        exec.shutdownNow();
        Time.sleep(100);

    }
}
